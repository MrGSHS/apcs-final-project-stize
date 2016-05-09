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
public class Inventory {
    private ArrayList<Dress> dresses;
    private ArrayList<Pants> pants;
    private ArrayList<Shirt> shirts;
    private ArrayList<Skirt> skirts;
    
    public ArrayList<Dress> getDresses(){
        return dresses;
    }
    
    public ArrayList<Pants> getPants(){
        return pants;
    }
    
    public ArrayList<Shirt> getShirts(){
        return shirts;
    }
    
    public ArrayList<Skirt> getSkirts(){
        return skirts;
    }
}
