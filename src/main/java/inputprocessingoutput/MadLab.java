package inputprocessingoutput;

import java.util.Scanner;

public class MadLab {
    public static void main(String[] args) {
//        Enter a noun: dog
//        Enter a verb: walk
//        Enter an adjective: blue
//        Enter an adverb: quickly
//        Do you walk your blue dog quickly? That's hilarious!

        System.out.println("Enter a noun: ");
        Scanner scanner = new Scanner(System.in);
        String noun = scanner.nextLine();
        System.out.println("Enter a verb: ");
        Scanner scanner1 = new Scanner(System.in);
        String verb = scanner1.nextLine();
        System.out.println("Enter an adjective: ");
        Scanner scanner2 = new Scanner(System.in);
        String adjective = scanner2.nextLine();
        System.out.println("Enter an adverb: ");
        Scanner scanner3 = new Scanner(System.in);
        String adverb = scanner3.nextLine();
        System.out.println();
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + " ?" + "That's hilarious!");
    }
}
