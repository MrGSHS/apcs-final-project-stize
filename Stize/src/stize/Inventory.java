/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stize;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author evillev6
 */
public class Inventory {
    private ArrayList<Dress> dresses;
    private ArrayList<Pants> pants;
    private ArrayList<Shirt> shirts;
    private ArrayList<Skirt> skirts;
    
 public Inventory(ArrayList<Dress> dresses,ArrayList<Pants> pants,ArrayList<Shirt> shirts,ArrayList<Skirt> skirts)
 {
     this.dresses = dresses;
     this.pants = pants;
     this.shirts = shirts;
     this.skirts = skirts;
     //sort each array in an appropriate order (by increasing price or different colors or brands)
     //should we create a new class that sorts the objects within each arraylist before being added to the inventory
     //can have customer choose in what order the objects should be sorted in (filters)
 
 }   
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
    
    public Clothes[] search(String type, int low, int high){
        ArrayList<Clothes> results = new ArrayList<>();
        Clothes[] searchResults;
        int lowIndex=0;
        int highIndex=0;
         if(type.equals("dress")){
            for (Dress d : dresses) {
                results.add(d);
            }
            
        }
        if(type.equals("pants")){
               for (Pants p : pants) {
                results.add(p);
            }
        }
        if(type.equals("shirt")){
               for (Shirt s : shirts) {
                results.add(s);
            }
        }
        if(type.equals("skirt")){}
           for (Skirt s : skirts) {
                results.add(s);
            }
        while(results.get(lowIndex).getPrice()<low){
            lowIndex++;
            highIndex = lowIndex;
        }
        while(results.get(highIndex).getPrice()<high){
            highIndex++;
        }
        searchResults = new Clothes[highIndex - lowIndex];
        int ctr = 0;
        for(int i = lowIndex; i < highIndex+1; i++){
            searchResults[ctr] = results.get(i);
            ctr++;
        }
         return searchResults;   
        
        
    }
}
