# STIZE

Creators: Tiffany, Grace, Aareana, Katia

###PROBLEM
Often it is hard for higher-number sized customers to find a good selection of clothes. Stize makes shopping plus size more accessible by combining the offers of several merchants (i.e. Forever 21, H&M, American Eagle) onto one websites so that customers will have an easier time finding a variety of clothing styles in their size.

###USERS
Plus size customers
Clothing Retail Store Merchants

###DESCRIPTION OF CLASSES
(1) CartDisplay

A GUI that displays the cart of purchased items.

(2) Clothes

Parameters: int size, int price, String brand, String color, String fileName

Methods:
Getter methods that return each parameter variable
boolean inRange(int low, int high)
    checks whether that clothing item is within the price range of the customer, returns True is in range
String toString()
    returns parameters of the Clothes object printed out 

(3) ContactEditorUI

A GUI that has the customer enter in their information.

(4) Customer

Parameters: String type, int size, String color, int lowPrice, int highPrice

Methods:
Getter methods that return each parameter variable
void purchase (Clothes c)
    adds an Clothes item to the customer's cart
ArrayList<Clothes> cart()
    returns the ArrayList with Customer's purchased items

(5) Dress extendsClothes

Parameters: int size, int price, String brand, String color, String fileName

Methods:
Getter methods that return each parameter variable
boolean inRange(int low, int high)
    checks whether that clothing item is within the price range of the customer, returns True is in range
String toString()
    returns parameters of the Dress object printed out 

(6) ***Initialize Inventory*** --> creates the dress, skirt, shirt and pants objects that are to be part of the inventory (meant to act as a data storage file, not necessarily as a class)

Parameters: NONE

Methods: 
ArrayList<Dress> getDress()
    populates and returns an ArrayList of dresses
ArrayList<Shirt> getShirts()
    populates and returns an ArrayList of shirts
ArrayList<Skirt> getSkirts()
    populates and returns an ArrayList of skirts
ArrayList<Pants> getPants()
    populates and returns an ArrayList of pants


(7) Inventory

Parameters: ArrayList <Pants>, ArrayList <Dress>, ArrayList <Shirt>, ArrayList <Skirt>

Methods: 
ArrayList<Dress> getDress()
    returns an ArrayList of dresses
ArrayList<Shirt> getShirts()
    returns an ArrayList of shirts
ArrayList<Skirt> getSkirts()
    returns an ArrayList of skirts
ArrayList<Pants> getPants()
    returns an ArrayList of pants
ArrayList<Clothes> search(String type, int low, int high, String color)
    Creates an Arraylist of clothes that match the user's inputted type and price range (for the future make color a factor as well)


(8) Pants extends Clothes

Parameters: int size, int price, String brand, String color, String fileName

Methods:
Getter methods that return each parameter variable
boolean inRange(int low, int high)
    checks whether that clothing item is within the price range of the customer, returns True is in range
String toString()
    returns parameters of the Pants object printed out 

(9) Shirt extends Clothes

Parameters: int size, int price, String brand, String color, String fileName

Methods:
Getter methods that return each parameter variable
boolean inRange(int low, int high)
    checks whether that clothing item is within the price range of the customer, returns True is in range
String toString()
    returns parameters of the Shirt object printed out 

(10) Skirt extends Clothes

Parameters: int size, int price, String brand, String color, String fileName

Methods:
Getter methods that return each parameter variable
boolean inRange(int low, int high)
    checks whether that clothing item is within the price range of the customer, returns True is in range
String toString()
    returns parameters of the Skirt object printed out 

(11) ***Stize*** --> a runner class that creates the inventory object and searches through the inventory 

###OUR LOGO

![STIZE](Stize/src/Images/newpackage/Stize logo 2.png) 

