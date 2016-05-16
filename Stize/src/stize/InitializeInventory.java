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
    
    private ArrayList<Dress> dresses;
    private ArrayList<Pants> pants;
    private ArrayList<Shirt> shirts;
    private ArrayList<Skirt> skirts;
    
    public InitializeInventory(){};
    
    public ArrayList<Dress> getDresses(){
    Dress dress1 = new Dress((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "blue");
    Dress dress2 = new Dress((int)Math.random()*3+1,(int)Math.random()*10+10,"Sears", "blue");
    Dress dress3 = new Dress((int)Math.random()*3+1,(int)Math.random()*100+100,"Burberry", "blue");
    Dress dress4 = new Dress((int)Math.random()*3+1,(int)Math.random()*40+10,"American Eagle", "blue");
    Dress dress5 = new Dress((int)Math.random()*3+1,(int)Math.random()*10+10,"Forever 21", "blue");
    Dress dress6 = new Dress((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "blue");
    Dress dress7 = new Dress((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "blue");
    Dress dress8 = new Dress((int)Math.random()*3+1,(int)Math.random()*20+10,"Sears", "blue");
    Dress dress9 = new Dress((int)Math.random()*3+1,(int)Math.random()*10+10,"Forever 21", "blue");
    Dress dress10 = new Dress((int)Math.random()*3+1,(int)Math.random()*40+10,"American Eagle", "blue");
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
    Skirt skirt1 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "green");
    Skirt skirt2 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"Sears", "red");
    Skirt skirt3 = new Skirt((int)Math.random()*3+1,(int)Math.random()*100+100,"Burberry", "red");
    Skirt skirt4 = new Skirt((int)Math.random()*3+1,(int)Math.random()*40+10,"American Eagle", "blue");
    Skirt skirt5 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"Forever 21", "red");
    Skirt skirt6 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "green");
    Skirt skirt7 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "green");
    Skirt skirt8 = new Skirt((int)Math.random()*3+1,(int)Math.random()*20+10,"Sears", "red");
    Skirt skirt9 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"Forever 21", "black");
    Skirt skirt10 = new Skirt((int)Math.random()*3+1,(int)Math.random()*40+10,"American Eagle", "green");
    Skirt skirt11 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "blue");
    Skirt skirt12 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "red");
    Skirt skirt13 = new Skirt((int)Math.random()*3+1,(int)Math.random()*20+10,"Sears", "red");
    Skirt skirt14 = new Skirt((int)Math.random()*3+1,(int)Math.random()*10+10,"Forever 21", "red");
    Skirt skirt15 = new Skirt((int)Math.random()*3+1,(int)Math.random()*40+10,"American Eagle", "blue");
    Skirt skirt16 = new Skirt((int)Math.random()*3+1,(int)Math.random()*40+10,"American Eagle", "blue");
    
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
    Shirt shirt1 = new Shirt((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "white");
    Shirt shirt2 = new Shirt((int)Math.random()*3+1,(int)Math.random()*10+10,"Sears", "green");
    Shirt shirt3 = new Shirt((int)Math.random()*3+1,(int)Math.random()*100+100,"Burberry", "white");
    Shirt shirt4 = new Shirt((int)Math.random()*3+1,(int)Math.random()*40+10,"American Eagle", "white");
    Shirt shirt5 = new Shirt((int)Math.random()*3+1,(int)Math.random()*10+10,"Forever 21", "white");
    Shirt shirt6 = new Shirt((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "white");
    Shirt shirt7 = new Shirt((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "white");
    Shirt shirt8 = new Shirt((int)Math.random()*3+1,(int)Math.random()*20+10,"Sears", "blue");
    Shirt shirt9 = new Shirt((int)Math.random()*3+1,(int)Math.random()*10+10,"Forever 21", "blue");
    Shirt shirt10 = new Shirt((int)Math.random()*3+1,(int)Math.random()*40+10,"American Eagle", "black");
    Shirt shirt11 = new Shirt((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "black");
    Shirt shirt12 = new Shirt((int)Math.random()*3+1,(int)Math.random()*10+10,"Sears", "black");
    Shirt shirt13 = new Shirt((int)Math.random()*3+1,(int)Math.random()*100+100,"Burberry", "green");
    Shirt shirt14 = new Shirt((int)Math.random()*3+1,(int)Math.random()*40+10,"American Eagle", "green");
    
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
    Pants pants1 = new Pants((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "blue");
    Pants pants2 = new Pants((int)Math.random()*3+1,(int)Math.random()*10+10,"Sears", "blue");
    Pants pants3 = new Pants((int)Math.random()*3+1,(int)Math.random()*100+100,"Burberry", "blue");
    Pants pants4 = new Pants((int)Math.random()*3+1,(int)Math.random()*40+10,"American Eagle", "blue");
    Pants pants5 = new Pants((int)Math.random()*3+1,(int)Math.random()*10+10,"Forever 21", "blue");
    Pants pants6 = new Pants((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "blue");
    Pants pants7 = new Pants((int)Math.random()*3+1,(int)Math.random()*10+10,"H&M", "blue");
    Pants pants8 = new Pants((int)Math.random()*3+1,(int)Math.random()*20+10,"Sears", "blue");
    Pants pants9 = new Pants((int)Math.random()*3+1,(int)Math.random()*10+10,"Forever 21", "blue");
    Pants pants10 = new Pants((int)Math.random()*3+1,(int)Math.random()*40+10,"American Eagle", "blue");
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
  

