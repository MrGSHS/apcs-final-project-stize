/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stize;

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
        ///CAN U SEE THIS???
        ///TESTING
        Scanner c = new Scanner(System.in);
        System.out.println("What article of clothing are you searching for? ");
        String type = c.nextLine();
        System.out.println("What is your size? ");
        int size = c.nextInt();
        System.out.println("What color would you like? ");
        String color = c.nextLine();
        System.out.println("What is the low end of your price range? ");
        int low = c.nextInt();
        System.out.println("What is the high end of your price range? ");
        int high = c.nextInt();
        
        Customer customer = new Customer(type, size, color, low, high);
        
        
    }
    
}
