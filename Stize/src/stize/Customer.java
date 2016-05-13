/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stize;

import java.util.ArrayList;

/**
 *
 * @author evillev6
 */
public class Customer {
    private int size;
    private String color;
    private String type;
    private int low;
    private int high;
    ArrayList<Clothes> purchased = new ArrayList<>();
    ArrayList<Clothes> cart = new ArrayList<>();
    
    public Customer(String t, int s, String c, int l, int h){
        type = t;
        size = s;
        color = c;
        low = l;
        high = h;
    }
    
    public int getSize(){
        return size;
    }
    public String getColor(){
        return color;
    }
    public String getType(){
        return type;
    }
    public int getLow(){
        return low;
    }
    public int getHigh(){
        return high;
    }
    public void purchase (Clothes c){
        cart.add(c);
    }
    
    public ArrayList<Clothes> cart(){
        return cart;
    }
    
    
}
