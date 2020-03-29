package inputprocessingoutput;

import java.util.Scanner;

public class AreaOfaRectangularRoom {

    public static final double constantaFeetMp = 0.09290304;
    public static void main(String[] args) {

        int areaSquareInFeet;
        double areaSquareInMetters;

        System.out.println("What is the length of the room in feet?");
        Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();

        System.out.println("What is the width of the room in feet?");
        Scanner scanner1  = new Scanner(System.in);
        int width = scanner1.nextInt();
        System.out.println("You entered dimensions of " + lenght + " feet " + "by " + width + " feet.");

        areaSquareInFeet = lenght * width;
        areaSquareInMetters = areaSquareInFeet * constantaFeetMp;

        System.out.println("The area is: ");
        System.out.println(areaSquareInFeet + " square feet");
        System.out.println(areaSquareInMetters + " square meters");

    }
}
