package inputprocessingoutput;

import java.util.Scanner;

public class SelfCheckOut {
    public static final double taxes = 0.055;
    public static void main(String[] args) {
        System.out.println("Enter the price of item 1");
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        System.out.println("Enter the quantity of item 1");
        Scanner scanner1 = new Scanner(System.in);
        double quantity = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the price of item 2");
        double price1 = scanner2.nextDouble();
        System.out.println("Enter the quantity of item 2");
        Scanner scanner3 = new Scanner(System.in);
        double quantity1 = scanner3.nextDouble();
        System.out.println("Enter the price of item 3");
        Scanner scanner4 = new Scanner(System.in);
        double price2 = scanner4.nextDouble();
        System.out.println("Enter the quantity of item 3");
        Scanner scanner5 = new Scanner(System.in);
        double quantity2 = scanner5.nextDouble();

        double subtotal = (price*quantity + price1*quantity1 + price2*quantity2);
        double tax = subtotal * taxes;
        double total = subtotal + tax;
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}
//    Enter the price of item 1: 25
//        Enter the quantity of item 1: 2
//        Enter the price of item 2: 10
//        Enter the quantity of item 2: 1
//        Enter the price of item 3: 4
//        Enter the quantity of item 3: 1
//        Subtotal: $64.00
//        Tax: $3.52
//        Total: $67.52