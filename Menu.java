package HotelBillingSystem;

import java.util.*;

public class Menu {
    public static void main(String[] args) {
        String name = null;
        int itemId = 0;
        String itemName = null;
        int itemPrice = 0;
        int quantity = 0;
        int subTotal = 0;
        int total = 0;
        String choice = "Y";
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Vishnu Park Hotel");
        System.out.println("Enter Your Name : ");
        name = sc.nextLine();
        ArrayList<Bill> al = new ArrayList<>();
        do {
            System.out.println("Dear " + name + " ,below is the menu");
            System.out.println("-------------------------------------");
            System.out.println("Item ID       Item Name         Cost");
            System.out.println("-------------------------------------");
            System.out.println("1              Water            10");
            System.out.println("2              Pepsi            40");
            System.out.println("3              Fries            60");
            System.out.println("4              Pizza            100");
            System.out.println("5              Burger           150");
            System.out.println("-------------------------------------");
            System.out.println("Enter the Item ID: ");
            itemId = sc.nextInt();
            System.out.println("Enter the Quantity: ");
            quantity = sc.nextInt();
            switch (itemId) {
                case 1 -> {
                    itemName = "Water";
                    itemPrice = 10;
                    subTotal = quantity * itemPrice;
                }
                case 2 -> {
                    itemName = "Pepsi";
                    itemPrice = 40;
                    subTotal = quantity * itemPrice;
                }
                case 3 -> {
                    itemName = "Fries";
                    itemPrice = 60;
                    subTotal = quantity * itemPrice;
                }
                case 4 -> {
                    itemName = "Pizza";
                    itemPrice = 100;
                    subTotal = quantity * itemPrice;
                }
                case 5 -> {
                    itemName = "Burger";
                    itemPrice = 150;
                    subTotal = quantity * itemPrice;
                }
                default -> System.out.println("Invalid Item ID(1 - 5)");
            }
            total += subTotal;
            System.out.println("Item Name: " + itemName + " Item Price: " + itemPrice + " Quantity: " + quantity + " Sub Total: " + subTotal);
            al.add(new Bill(itemId, itemPrice, itemName, quantity, subTotal));
            System.out.println("Do you want to order anything more (Y/N)");
            choice = sc.next();
        } while (choice.equals("Y"));
        System.out.println("----------------------------------------------");
        System.out.println("ItemID  ItemName  ItemPrice  Quantity  Subtotal");
        for (Bill x : al) {
            System.out.println(x);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("The Total Bill is: "+ total);
        System.out.println("Thank you for your order, " + name + "! Please visit again.");
    }
}
