package inputprocessingoutput;

import java.util.Scanner;

public class PaintCalculator {
    public static  final double constant = 0.0028571428571429;
    public static void main(String[] args) {

        double area;
        int neededGallons;
        double fixNeededGallons;
        double incrementToHoleNumber;

        System.out.println("What is the length in feet?");
        Scanner scanner = new Scanner(System.in);
        double lenght = scanner.nextDouble();

        System.out.println("What is the width in feet?");
        Scanner scanner1  = new Scanner(System.in);
        double width = scanner1.nextDouble();
        area = lenght * width;
//        System.out.println("You're area to paint is: " + area);

        neededGallons = (int) (area * constant);
        fixNeededGallons = area * constant;
        incrementToHoleNumber = fixNeededGallons - neededGallons;
        if (incrementToHoleNumber >0){ neededGallons++;
        }else {}

            System.out.println("You will need to purchase " + neededGallons + " gallons of paint to cover " + area + " square feet");


//        You will need to purchase 2 gallons of
//        paint to cover 360 square feet.
//        Remember, you can’t buy a partial gallon of paint.You must
//        round up to the next whole gallo
    }
}
