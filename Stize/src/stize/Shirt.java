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
public class Shirt extends Clothes{
    
    public Shirt(int size, int price, String brand, String color, String fileName) {
        super(size, price, brand, color, fileName);
    }
    
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
    public String getFilename(){
        return super.getFilename();
    }
    public boolean inRange(int low, int high){
        if(super.getPrice()>=low && super.getPrice() <=high){
            return true;
        }
        return false;
    }
    
    public String toString (){

        String str = "\nSize: " +super.getSize()+ "\nPrice: "+super.getPrice() +
                "\nBrand: "+super.getBrand()+"\nColor: "+super.getColor();

        return str;        
    }
}
