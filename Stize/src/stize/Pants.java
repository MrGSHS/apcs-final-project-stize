/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stize;

/**
 *
 * @author evillev6
 */
public class Pants extends Clothes{
    
    public Pants(int size, int price, String type, String brand, String color) {
        super(size, price, type, brand, color);
    }
    
    public int getSize(){
        return super.getSize();
    }
    
    public int getPrice(){
        return super.getPrice();
    }
    
    public String getType(){
        return super.getType();
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
        String str = "Type: "+super.getType()+" Size: " +super.getSize()+ " Price: "+super.getPrice() +
                " Brand: "+super.getBrand()+" Color: "+super.getColor();
        return str;        
    }
    
}
