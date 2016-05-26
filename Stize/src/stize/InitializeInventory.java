/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stize;

import java.util.ArrayList;

/**
 *
 * @author katiadance
 */
public class InitializeInventory {
    //use this class to create a static inventory object and add to it the different types of clothing

    //for loop to create each type of object
    
    private ArrayList<Dress> dresses = new ArrayList<Dress>();
    private ArrayList<Pants> pants = new ArrayList<Pants>();
    private ArrayList<Shirt> shirts = new ArrayList<Shirt>();
    private ArrayList<Skirt> skirts = new ArrayList<Skirt>(); 
    
    public InitializeInventory(){};
    
    public ArrayList<Dress> getDresses(){
    Dress dress1 = new Dress((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "blue", "/images/newpackage/blueDress1.jpg");
    Dress dress2 = new Dress((int)Math.random()*3+1,(int)Math.random()*10+10,"Sears", "blue", "/images/newpackage/blueDress2.jpg");
    Dress dress3 = new Dress((int)Math.random()*3+1,(int)Math.random()*100+100,"Burberry", "red", "/images/newpackage/redBurberrydress.jpg");
    Dress dress4 = new Dress((int)Math.random()*3+1,(int)Math.random()*40+10,"American Eagle", "red", "/images/newpackage/AEredDress.jpg");
    Dress dress5 = new Dress((int)Math.random()*3+1,(int)Math.random()*10+10,"Forever 21", "white", "/images/newpackage/21WhiteDress.jpg");
    Dress dress6 = new Dress((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "white", "/images/newpackage/HMWhiteDress.jpg");
    Dress dress7 = new Dress((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "green", "/images/newpackage/HMgreenDress.jpg");
    Dress dress8 = new Dress((int)Math.random()*3+1,(int)Math.random()*20+10,"Sears", "black", "/images/newpackage/searsBlackDress.jpg");
    Dress dress9 = new Dress((int)Math.random()*3+1,(int)Math.random()*10+10,"Forever 21", "black", "/images/newpackage/21BlackDress.jpg");
    Dress dress10 = new Dress((int)Math.random()*3+1,(int)Math.random()*40+10,"American Eagle", "blue", "/images/newpackage/AEblueDress.jpg");
    dresses.add(dress1);
    dresses.add(dress2);
    dresses.add(dress3);
    dresses.add(dress4);
    dresses.add(dress5);
    dresses.add(dress6);
    dresses.add(dress7);
    dresses.add(dress8);
    dresses.add(dress9);
    dresses.add(dress10);
    return dresses;
    
    }
    
  public ArrayList<Skirt> getSkirts(){
    Skirt skirt1 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"Forever 21", "blue", "/images/newpackage/21blueSkirt.jpg");
    Skirt skirt2 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"Forever 21", "blue", "/images/newpackage/21blueSkirt2.jpg");
    Skirt skirt3 = new Skirt((int)Math.random()*3+1,(int)Math.random()*100+100,"Forever 21", "red", "/images/newpackage/21redSkirt.jpg");
    Skirt skirt4 = new Skirt((int)Math.random()*3+1,(int)Math.random()*40+10,"Forever 21", "red", "/images/newpackage/21RedSkirt2.jpg");
    Skirt skirt5 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"American Eagle", "red", "/images/newpackage/AEredskirt.jpg");
    Skirt skirt6 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"American Eagle", "red", "/images/newpackage/AEredSkirt2.jpg");
    Skirt skirt7 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"Burberry", "red", "/images/newpackage/BurberryRedSkirt.jpg");
    Skirt skirt8 = new Skirt((int)Math.random()*3+1,(int)Math.random()*20+10,"H&M", "red", "/images/newpackage/HMredSkirt.jpg");
    Skirt skirt9 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"Sears", "red", "/images/newpackage/SearsredSkirt.jpg");
    Skirt skirt10 = new Skirt((int)Math.random()*3+1,(int)Math.random()*40+10,"American Eagle", "green","/images/newpackage/AEgreenSkirt.jpg");
    Skirt skirt11 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"Burberry", "green", "/images/newpackage/BurberryGreenSkirt.jpg");
    Skirt skirt12 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "green", "/images/newpackage/HMgreenSkirt.jpg");
    Skirt skirt13 = new Skirt((int)Math.random()*3+1,(int)Math.random()*20+10,"H&M", "green", "/images/newpackage/HMgreenSkirt2.jpg");
    Skirt skirt14 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"Sears", "green","/images/newpackage/SearsgreenSkirt.jpg");
    Skirt skirt15 = new Skirt((int)Math.random()*3+1,(int)Math.random()*40+10,"Sears", "black", "/images/newpackage/SearsblackSkirt.jpg");
    Skirt skirt16 = new Skirt((int)Math.random()*3+1,(int)Math.random()*40+10,"Burberry", "black","/images/newpackage/BurberryBlackSkirt.jpg");
    
    skirts.add(skirt1);
    skirts.add(skirt2);
    skirts.add(skirt3);
    skirts.add(skirt4);
    skirts.add(skirt5);
    skirts.add(skirt6);
    skirts.add(skirt7);
    skirts.add(skirt8);
    skirts.add(skirt9);
    skirts.add(skirt10);
    skirts.add(skirt11);
    skirts.add(skirt12);
    skirts.add(skirt13);
    skirts.add(skirt14);
    skirts.add(skirt15);
    skirts.add(skirt16);
    return skirts;
    
    }
    public ArrayList<Shirt> getShirts(){
    Shirt shirt1 = new Shirt((int)Math.random()*3+1,(int)Math.random()*10+10,"Forever 21", "blue", "/images/newpackage/21blueShirt.jpg");
    Shirt shirt2 = new Shirt((int)Math.random()*3+1,(int)Math.random()*10+10,"American Eagle", "blue", "/images/newpackage/AEBlueShirt.jpg");
    Shirt shirt3 = new Shirt((int)Math.random()*3+1,(int)Math.random()*100+100,"H&M", "blue", "/images/newpackage/HMBlueShirt.jpg");
    Shirt shirt4 = new Shirt((int)Math.random()*3+1,(int)Math.random()*40+10,"Sears", "blue", "/images/newpackage/SearsBlueShirt.jpg");
    Shirt shirt5 = new Shirt((int)Math.random()*3+1,(int)Math.random()*10+10,"American Eagle", "green","/images/newpackage/AEgreenShirt.jpg" );
    Shirt shirt6 = new Shirt((int)Math.random()*3+1,(int)Math.random()*10+10,"Burberry", "green", "/images/newpackage/BurberryGreenShirt.jpg");
    Shirt shirt7 = new Shirt((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "green", "/images/newpackage/HMgreenShirt.jpg");
    Shirt shirt8 = new Shirt((int)Math.random()*3+1,(int)Math.random()*20+10,"Sears", "green","/images/newpackage/SearsGreenShirt.jpg");
    Shirt shirt9 = new Shirt((int)Math.random()*3+1,(int)Math.random()*10+10,"American Eagle", "white", "/images/newpackage/AEwhiteShirt.jpg");
    Shirt shirt10 = new Shirt((int)Math.random()*3+1,(int)Math.random()*40+10,"Burberry", "white", "/images/newpackage/BurberryWhiteShirt.jpg");
    Shirt shirt11 = new Shirt((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "white", "/images/newpackage/HMwhiteShirt.jpg");
    Shirt shirt12 = new Shirt((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "white", "/images/newpackage/HMwhiteShirt2.jpg");
    Shirt shirt13 = new Shirt((int)Math.random()*3+1,(int)Math.random()*100+100,"Burberry", "black", "/images/newpackage/BurberryBlackShirt.jpg");
    Shirt shirt14 = new Shirt((int)Math.random()*3+1,(int)Math.random()*40+10,"Sears", "black", "/images/newpackage/SearsblackShirt.jpg");
    
    shirts.add(shirt1);
    shirts.add(shirt2);
    shirts.add(shirt3);
    shirts.add(shirt4);
    shirts.add(shirt5);
    shirts.add(shirt6);
    shirts.add(shirt7);
    shirts.add(shirt8);
    shirts.add(shirt9);
    shirts.add(shirt10);
    shirts.add(shirt11);
    shirts.add(shirt12);
    shirts.add(shirt13);
    shirts.add(shirt14);
    return shirts;
    }
    public ArrayList<Pants> getPants(){
        
        //finish creating pants fix method names in stize
    Pants pants1 = new Pants((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "pink", "H&M - pink pants.jpg");
    Pants pants2 = new Pants((int)Math.random()*3+1,(int)Math.random()*10+10,"Sears", "purple", "Sears - purple pants.jpeg");
    Pants pants3 = new Pants((int)Math.random()*3+1,(int)Math.random()*100+100,"Burberry", "red", "Burberry - red pants.jpeg");
    Pants pants4 = new Pants((int)Math.random()*3+1,(int)Math.random()*40+10,"American Eagle", "black", "American Eagle - black pants.jpeg");
    Pants pants5 = new Pants((int)Math.random()*3+1,(int)Math.random()*10+10,"Forever 21", "pink", "Forever 21 - pink pants.jpeg");
    Pants pants6 = new Pants((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "red", "H&M - red pants.jpg");
    Pants pants7 = new Pants((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "black", "H&M - black pants.jpeg");
    Pants pants8 = new Pants((int)Math.random()*3+1,(int)Math.random()*20+10,"Sears", "white", "Sears - white pants.jpeg");
    Pants pants9 = new Pants((int)Math.random()*3+1,(int)Math.random()*10+10,"Forever 21", "purple", "Forever 21 - purple pants.jpeg");
    Pants pants10 = new Pants((int)Math.random()*3+1,(int)Math.random()*40+10,"American Eagle", "pink", "American Eagle - pink pants.jpeg");
    pants.add(pants1);
    pants.add(pants2);
    pants.add(pants3);
    pants.add(pants4);
    pants.add(pants5);
    pants.add(pants6);
    pants.add(pants7);
    pants.add(pants8);
    pants.add(pants9);
    pants.add(pants10);
    return pants;
    
    }
    
    }
  




