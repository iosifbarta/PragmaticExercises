package inputprocessingoutput;

import java.util.Scanner;

public class CoutingTheNumberOfChar {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("What is the input string?");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int wordLenght = word.length();

        System.out.println(word + " has " + wordLenght + " characters");

    }
}
