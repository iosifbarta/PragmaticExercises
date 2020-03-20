package inputprocessingoutput;

import java.util.Scanner;

public class PrintingQuates {
    public static void main(String[] args) {
//        What is the quote? These aren't the droids you're looking for.
//        Who said it? Obi-Wan Kenobi
//        Obi-Wan Kenobi says, "These aren't the droids
//        you're looking for."
        System.out.println("What is the quote?");
        Scanner scanner = new Scanner(System.in);
        String quote = scanner.nextLine();
        System.out.println();
        System.out.println("Who said it?");
        Scanner scanner1 = new Scanner(System.in);
        String whoSaid = scanner1.nextLine();
        System.out.println();
        System.out.println(whoSaid + " says, "+"\"" + quote+"\".");

    }
}
