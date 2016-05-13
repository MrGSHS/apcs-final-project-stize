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
    
    }
    
    
    }
  
}
