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
    private String brand;
    private String color;
    private String fileName;
    
    public Clothes(int size, int price, String brand, String color, String fileName){
        this.size = size;
        this.price = price;
        this.brand = brand;
        this.color = color;
        this.fileName= fileName;
    }
    
    public int getSize(){
        return size;
    }
    
    public int getPrice(){
        return price;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getFilename(){
        return fileName;
    }
    public boolean inRange(int low, int high){
        if(price>=low && price <=high){
            return true;
        }
        return false;
    }
    
    public String toString (){

        String str = "\nSize: " +size+ "\nPrice: "+price +
                "\nBrand: "+brand+"\nColor: "+color;

        return str;        
    }
}





