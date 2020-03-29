package inputprocessingoutput;

import java.util.Scanner;

public class PizzaParty {
    public static final int pizzaDivide = 8;
    public static void main(String[] args) {

        int leftOver;
        int piecesOfPizza;
        int getNUmberOfPiecesForEachPeople;


        System.out.println("How many people?");
        Scanner scanner = new Scanner(System.in);
        int peopleNumber = scanner.nextInt();
        System.out.println("How many pizzas do you have?");
        Scanner scanner1 = new Scanner(System.in);
        int numberOfPizzas = scanner1.nextInt();

        piecesOfPizza = numberOfPizzas * pizzaDivide;
        getNUmberOfPiecesForEachPeople = piecesOfPizza / peopleNumber;
        leftOver = piecesOfPizza - (getNUmberOfPiecesForEachPeople * peopleNumber);
        if (peopleNumber == pizzaDivide){
            System.out.println("Each person gets " + getNUmberOfPiecesForEachPeople + " piece of pizza.");
        }else {
            System.out.println("Each person gets " + getNUmberOfPiecesForEachPeople + " pieces of pizza.");
        }
        System.out.println("There are " + leftOver  + " leftover pieces.");
    }
//    How many people? 8
//    How many pizzas do you have? 2
//            8 people with 2 pizzas
//    Each person gets 2 pieces of pizza.
//    There are 0 leftover pieces.

}
