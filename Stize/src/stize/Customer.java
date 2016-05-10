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
    public Customer(String t, int s, String c, int l, int h){
        type = t;
        size = s;
        color = c;
        low = l;
        high = h;
    }
    public ArrayList<Clothes>[] findClothes (int size, String color,
            int low, int high){
        if(type.equals("dress")){
            
        }
        if(type.equals("pants")){
            
        }
        if(type.equals("shirt")){
            
        }
        if(type.equals("skirt"))
        
    }
    
}
