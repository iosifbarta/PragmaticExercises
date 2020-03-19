package inputprocessingoutput;

import java.util.Scanner;

public class SayingHello {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String newName = scanner.nextLine();
        System.out.println("Hello, " + newName + ", nice to meet you!");
        System.out.println();
        System.out.println("What is your name?");
        Scanner scanner1 = new Scanner(System.in);
        String newName2 = scanner1.nextLine();
        System.out.println("Ciao, " + newName2 + ", come stai?");
    }
}
