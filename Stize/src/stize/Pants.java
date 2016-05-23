/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stize;
import java.awt.Image;
/**
 *
 * @author evillev6
 */
public class Pants extends Clothes{
    
    public Pants(int size, int price, String brand, String color, String fileName) {
        super(size, price, brand, color, fileName);}
 
      
    public int getSize(){
        return super.getSize();
    }
    
    public int getPrice(){
       return super.getPrice();
     }
  
     
    public String getBrand(){
       return super.getBrand();
     }
    
    public String getColor(){
        return super.getColor();
    }
    public boolean inRange(int low, int high){
        if(super.getPrice()>=low && super.getPrice() <=high){
            return true;
        }
        return false;
    }  
    public String toString (){
      String str = " Size: " +super.getSize()+ " Price: "+super.getPrice() +
               " Brand: "+super.getBrand()+" Color: "+super.getColor()+" Filename: "+super.getFilename();
        return str;        
    }
  }

