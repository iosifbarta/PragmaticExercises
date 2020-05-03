package inputprocessingoutput;

import utils.ScannerUtils;

import java.util.InputMismatchException;

public class NumbersToName {
    public static void main(String[] args) {

        System.out.println("Please enter the number of the month:");
       int x= number();
        switch (x){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }

    public static int number() {
        int x = ScannerUtils.nextSingleInt();
       try {
           if (x<0){
               System.out.println("Please enter a bigger number than 0");
               return number();
           }if (x>12){
               System.out.println("You must enter a number between 1-12");
               return number();
           }
       }catch (InputMismatchException e){
           System.out.println("Please enter a number");
           return number();
       }return x;
    }
}
