/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stize;

import Image.ResultDisplay;
import java.util.Scanner;

/**
 *
 * @author evillev6
 */
public class Stize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c = new Scanner(System.in);
        System.out.println("What article of clothing are you searching for? ");
        String type = c.nextLine();
        System.out.println("What color would you like? ");
        String color = c.nextLine();
        System.out.println("What is your size? ");
        int size = c.nextInt();
        System.out.println("What is the low end of your price range? ");
        int low = c.nextInt();
        System.out.println("What is the high end of your price range? ");
        int high = c.nextInt();
        
        
        /*
        Customer customer = new Customer(type, size, color, low, high);
        
        InitializeInventory data = new InitializeInventory();
        Inventory inventory = new Inventory(data.getDresses(),
                data.getPants(),data.getShirts(),data.getSkirts());
        System.out.println(inventory.search(type,low,high,color));
        customer.purchase();
        inventory.purchase(); 

        System.out.println(customer.cart());

        System.out.println("Thank you for shopping on Stize! Have a great Day!");
    */
        
         Customer customer = new Customer(type, size, color, low, high);
         /*Inventory inventory = new Inventory(InitializeInventory.getDresses(),
         InitializeInventory.getPants(),InitializeInventory.getShirts(),
         InitializeInventory.getSkirts()); 
         searchResults = inventory.search(type,low,high,color);*/
         searchResults.add(new Clothes(1,4,"pants","polo","red","/images/newpackage/greenskirt.jpg"));
         searchResults.add(new Clothes(1,4,"pants","polo","green","/images/newpackage/redbowskirt.jpg"));
         /*System.out.println(inventory.search(type,low,high,color));
         customer.purchase();
         inventory.remove();*/
         /*System.out.println(customer.printPurchased());*/
         new ResultDisplay(searchResults).setVisible(true);
         System.out.println("Thank you for shopping on Stize! Have a great Day!");
        

                }
    
}
