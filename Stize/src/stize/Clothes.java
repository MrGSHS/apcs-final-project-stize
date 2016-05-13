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
public class Clothes {
    private int size;
    private int price;
    private String type;
    private String brand;
    private String color;
    
    public Clothes(int size, int price, String type, String brand, String color){
        this.size = size;
        this.price = price;
        this.type = type;
        this.brand = brand;
        this.color = color;
    
    }
    
    public int getSize(){
        return size;
    }
    
    public int getPrice(){
        return price;
    }
    
    public String getType(){
        return type;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public String getColor(){
        return color;
    }
    public boolean inRange(int low, int high){
        if(price>=low && price <=high){
            return true;
        }
        return false;
    }
    
    public String toString (){
        String str = "\nType: "+type+"\nSize: " +size+ "\nPrice: "+price +
                "\nBrand: "+brand+"\nColor: "+color;
        return str;        
    }
}
