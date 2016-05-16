/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stize;

import java.awt.image.BufferedImage;

/**
 *
 * @author tsheu6
 */
public class Image {
    /**
   * the file name associated with the simple picture
   */
  private String fileName;
  
  /**
   * the title of the simple picture
   */
  private String title;
  
  /**
   * buffered image to hold pixels for the simple picture
   */
  private BufferedImage bufferedImage;
  

  
  /** 
   * extension for this file (jpg or bmp)
   */
  private String extension;
  
    
 /**
  * A Constructor that takes a file name and uses the file to create
  * a picture
  * @param fileName the file name to use in creating the picture
  */
 public Image(String fileName)
 {
   
   // load the picture into the buffered image 
   load(fileName);
   
   
 }
 

 

 
 ////////////////////////// Methods //////////////////////////////////
 
 /**
  * Method to get the extension for this picture
  * @return the extendsion (jpg, bmp, giff, etc)
  */
 public String getExtension() { return extension; }

 
 /**
  * Method that will copy all of the passed source picture into
  * the current picture object 
  * @param sourcePicture  the picture object to copy
  */
 
 /**
  * Method to get the buffered image
  * @return the buffered image 
  */
 public BufferedImage getBufferedImage() 
 {
    return bufferedImage;
 }
 

 
 
 
 /**
  * Method to get the file name associated with the picture
  * @return  the file name associated with the picture
  */
 public String getFileName() { return fileName; }
 

 
 /**
  * Method to get the title of the picture
  * @return the title of the picture
  */
 public String getTitle() 
 { return title; }
 
 
 
 /**
  * Method to get the width of the picture in pixels
  * @return the width of the picture in pixels
  */
 public int getWidth() { return bufferedImage.getWidth(); }
 
 /**
  * Method to get the height of the picture in pixels
  * @return  the height of the picture in pixels
  */
 public int getHeight() { return bufferedImage.getHeight(); }
 
 
 /**
  * Method to get an image from the picture
  * @return  the buffered image since it is an image
  */
 public Image getImage()
 {
   return bufferedImage;
 }
 
 
 
 
 /**
  * Method to open a picture explorer on a copy (in memory) of this 
  * simple picture
  */
 public void explore()
 {
   // create a copy of the current picture and explore it
   new PictureExplorer(new SimplePicture(this));
 }
 
 /**
  * Method to force the picture to repaint itself.  This is very
  * useful after you have changed the pixels in a picture and
  * you want to see the change.
  */
 public void repaint()
 {
   // if there is a picture frame tell it to repaint
   if (pictureFrame != null)
     pictureFrame.repaint();
   
   // else create a new picture frame
   else
     pictureFrame = new PictureFrame(this);
 }
 
 /**
  * Method to load the picture from the passed file name
  * @param fileName the file name to use to load the picture from
  * @throws IOException if the picture isn't found
  */
 public void loadOrFail(String fileName) throws IOException
 {
    // set the current picture's file name
   this.fileName = fileName;
   
   // set the extension
   int posDot = fileName.indexOf('.');
   if (posDot >= 0)
     this.extension = fileName.substring(posDot + 1);
   
   // if the current title is null use the file name
   if (title == null)
     title = fileName;
   
   File file = new File(this.fileName);

   if (!file.canRead()) 
   {
     // try adding the media path 
     file = new File(FileChooser.getMediaPath(this.fileName));
     if (!file.canRead())
     {
       throw new IOException(this.fileName +
                             " could not be opened. Check that you specified the path");
     }
   }
   
   bufferedImage = ImageIO.read(file);
 }


 /**
  * Method to read the contents of the picture from a filename  
  * without throwing errors
  * @param fileName the name of the file to write the picture to
  * @return true if success else false
  */
 public boolean load(String fileName)
 {
     try {
         this.loadOrFail(fileName);
         return true;

     } catch (Exception ex) {
         System.out.println("There was an error trying to open " + fileName);
         bufferedImage = new BufferedImage(600,200,
                                           BufferedImage.TYPE_INT_RGB);
         addMessage("Couldn't load " + fileName,5,100);
         return false;
     }
         
 }

 /**
  * Method to load the picture from the passed file name
  * this just calls load(fileName) and is for name compatibility
  * @param fileName the file name to use to load the picture from
  * @return true if success else false
  */
 public boolean loadImage(String fileName)
 {
     return load(fileName);
 }
 
 /**
  * Method to draw a message as a string on the buffered image 
  * @param message the message to draw on the buffered image
  * @param xPos  the leftmost point of the string in x 
  * @param yPos  the bottom of the string in y
  */
 public void addMessage(String message, int xPos, int yPos)
 {
   // get a graphics context to use to draw on the buffered image
   Graphics2D graphics2d = bufferedImage.createGraphics();
   
   // set the color to white
   graphics2d.setPaint(Color.white);
   
   // set the font to Helvetica bold style and size 16
   graphics2d.setFont(new Font("Helvetica",Font.BOLD,16));
   
   // draw the message
   graphics2d.drawString(message,xPos,yPos);
   
 }
 
 /**
  * Method to draw a string at the given location on the picture
  * @param text the text to draw
  * @param xPos the left x for the text 
  * @param yPos the top y for the text
  */
 public void drawString(String text, int xPos, int yPos)
 {
   addMessage(text,xPos,yPos);
 }
 
 /**
   * Method to create a new picture by scaling the current
   * picture by the given 
   * @param rFactor the amount to scale in the height (rows)
   * @param cFactor the amount to scale in the width (columns)
   * @return the resulting picture
   */
  public Picture scale(double rFactor, double cFactor)
  {
    // set up the scale tranform
    AffineTransform scaleTransform = new AffineTransform();
    scaleTransform.scale(cFactor,rFactor);
    
    // create a new picture object that is the right size
    Picture result = new Picture((int) (getHeight() * rFactor),
                                 (int) (getWidth() * cFactor));
    
    // get the graphics 2d object to draw on the result
    Graphics graphics = result.getGraphics();
    Graphics2D g2 = (Graphics2D) graphics;
    
    // draw the current image onto the result image scaled
    g2.drawImage(this.getImage(),scaleTransform,null);
    
    return result;
  }
  
  /**
   * Method to create a new picture of the passed width. 
   * The aspect ratio of the width and height will stay
   * the same.
   * @param width the desired width
   * @return the resulting picture
   */
  public Picture getPictureWithWidth(int width)
  {
    // set up the scale tranform
    double xFactor = (double) width / this.getWidth();
    Picture result = scale(xFactor,xFactor);
    return result;
  }
  
  /**
   * Method to create a new picture of the passed height. 
   * The aspect ratio of the width and height will stay
   * the same.
   * @param height the desired height
   * @return the resulting picture
   */
  public Picture getPictureWithHeight(int height)
  {
    // set up the scale tranform
    double yFactor = (double) height / this.getHeight();
    Picture result = scale(yFactor,yFactor);
    return result;
  }
 
 /**
  * Method to load a picture from a file name and show it in a picture frame
  * @param fileName the file name to load the picture from
  * @return true if success else false
  */
 public boolean loadPictureAndShowIt(String fileName)
 {
   boolean result = true;  // the default is that it worked
   
   // try to load the picture into the buffered image from the file name
   result = load(fileName);
   
   // show the picture in a picture frame
   show();
   
   return result;
 }
 
 /**
  * Method to write the contents of the picture to a file with 
  * the passed name
  * @param fileName the name of the file to write the picture to
  */
 public void writeOrFail(String fileName) throws IOException
 {
   String extension = this.extension; // the default is current
   
   // create the file object
   File file = new File(fileName);
   File fileLoc = file.getParentFile(); // directory name
   
   // if there is no parent directory use the current media dir
   if (fileLoc == null)
   {
     fileName = FileChooser.getMediaPath(fileName);
     file = new File(fileName);
     fileLoc = file.getParentFile(); 
   }
   
   // check that you can write to the directory 
   if (!fileLoc.canWrite()) {
        throw new IOException(fileName +
        " could not be opened. Check to see if you can write to the directory.");
   }
   
   // get the extension
   int posDot = fileName.indexOf('.');
   if (posDot >= 0)
       extension = fileName.substring(posDot + 1);
   
   // write the contents of the buffered image to the file as jpeg
   ImageIO.write(bufferedImage, extension, file);
     
 }

 /**
  * Method to write the contents of the picture to a file with 
  * the passed name without throwing errors
  * @param fileName the name of the file to write the picture to
  * @return true if success else false
  */
 public boolean write(String fileName)
 {
     try {
         this.writeOrFail(fileName);
         return true;
     } catch (Exception ex) {
         System.out.println("There was an error trying to write " + fileName);
         ex.printStackTrace();
         return false;
     }
         
 }
 
 /**
  * Method to get the directory for the media
  * @param fileName the base file name to use
  * @return the full path name by appending
  * the file name to the media directory
  */
 public static String getMediaPath(String fileName) {
   return FileChooser.getMediaPath(fileName);
 }
 
  /**
   * Method to get the coordinates of the enclosing rectangle after this
   * transformation is applied to the current picture
   * @return the enclosing rectangle
   */
  public Rectangle2D getTransformEnclosingRect(AffineTransform trans)
  {
    int width = getWidth();
    int height = getHeight();
    double maxX = width - 1;
    double maxY = height - 1;
    double minX, minY;
    Point2D.Double p1 = new Point2D.Double(0,0);
    Point2D.Double p2 = new Point2D.Double(maxX,0);
    Point2D.Double p3 = new Point2D.Double(maxX,maxY);
    Point2D.Double p4 = new Point2D.Double(0,maxY);
    Point2D.Double result = new Point2D.Double(0,0);
    Rectangle2D.Double rect = null;
    
    // get the new points and min x and y and max x and y
    trans.deltaTransform(p1,result);
    minX = result.getX();
    maxX = result.getX();
    minY = result.getY();
    maxY = result.getY();
    trans.deltaTransform(p2,result);
    minX = Math.min(minX,result.getX());
    maxX = Math.max(maxX,result.getX());
    minY = Math.min(minY,result.getY());
    maxY = Math.max(maxY,result.getY());
    trans.deltaTransform(p3,result);
    minX = Math.min(minX,result.getX());
    maxX = Math.max(maxX,result.getX());
    minY = Math.min(minY,result.getY());
    maxY = Math.max(maxY,result.getY());
    trans.deltaTransform(p4,result);
    minX = Math.min(minX,result.getX());
    maxX = Math.max(maxX,result.getX());
    minY = Math.min(minY,result.getY());
    maxY = Math.max(maxY,result.getY());
    
    // create the bounding rectangle to return
    rect = new Rectangle2D.Double(minX,minY,maxX - minX + 1, maxY - minY + 1);
    return rect;
  }
  
  /**
   * Method to get the coordinates of the enclosing rectangle after this
   * transformation is applied to the current picture
   * @return the enclosing rectangle
   */
  public Rectangle2D getTranslationEnclosingRect(AffineTransform trans)
  {
    return getTransformEnclosingRect(trans);
  }
 
 /**
  * Method to return a string with information about this picture
  * @return a string with information about the picture 
  */
 public String toString()
 {
   String output = "Simple Picture, filename " + fileName + 
     " height " + getHeight() + " width " + getWidth();
   return output;
 }

} // end of SimplePicture class

    
}
