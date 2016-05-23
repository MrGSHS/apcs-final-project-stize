/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stize;

import java.util.Scanner;
import image.ResultDisplay;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import stize.ContactEditorUI;
/**
 *
 * @author evillev6
 */
public class Stize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Clothes> searchResult = new ArrayList<>();
        ArrayList<Clothes> item = new ArrayList<>();
        // TODO code application logic here
        
        String brand=" ", type = " ", color = " ";
        int size=0, low=0, high=0;
        new ContactEditorUI().setVisible(true);
        /*Customer customer = new Customer(brand, type, size, color, low, high);*/
        InitializeInventory data = new InitializeInventory();
        Inventory inventory = new Inventory(data.getDresses(),
                data.getPants(),data.getShirts(),data.getSkirts());
        System.out.println(inventory.search(type,low,high,color));
        /*customer.purchase();
        inventory.purchase(); 

        System.out.println(customer.cart());

        System.out.println("Thank you for shopping on Stize! Have a great Day!");
    */
        
         /*Customer customer = new Customer(type, size, color, low, high);*/
         /*Inventory inventory = new Inventory(InitializeInventory.getDresses(),
         InitializeInventory.getPants(),InitializeInventory.getShirts(),
         InitializeInventory.getSkirts()); */
         JOptionPane.showMessageDialog(null, new ContactEditorUI());
         new ContactEditorUI();
         /*searchResult = inventory.search(type,low,high,color);*/
         searchResult.add(new Clothes(1,4,"Polo","White","/images/newpackage/solidblackskirt.jpg"));
         searchResult.add(new Clothes(1,10,"Norm","Red","/images/newpackage/bluedenimshirt.jpg"));
         /*System.out.println(inventory.search(type,low,high,color));
         customer.purchase();
         inventory.remove();*/
         /*System.out.println(customer.printPurchased());*/
         new ResultDisplay(searchResult).setVisible(true);
         System.out.println("Thank you for shopping on Stize! Have a great Day!");
        

                }
    
}





