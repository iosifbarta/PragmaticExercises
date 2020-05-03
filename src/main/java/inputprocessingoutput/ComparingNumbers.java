package inputprocessingoutput;

import utils.ScannerUtils;

import java.util.InputMismatchException;

public class ComparingNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        int x = getNumber();
        System.out.println("Enter the second number: ");
        int y = getNumber();
        System.out.println("Enter the third number:");
        int z = getNumber();
        if(!checkCondition(x,y,z)){
            System.out.println("Some numbers have you entered are identical");
        }
        if ((x < y) && (y < z)){
                System.out.println("The largest number is "+ z);
        }else if((z<y) && (y<x)){
                System.out.println("The largest number is "+ x);
        }else if((z<x) && (x<y)){
                System.out.println("The largest number is " + y);
        }
    }

    public static int getNumber(){
        try {return ScannerUtils.nextSingleInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter a number!");
            return getNumber();
        }
    }
    public static boolean checkCondition (int x, int y, int z){
        return x != y && z != x && y!=z;
    }
}
