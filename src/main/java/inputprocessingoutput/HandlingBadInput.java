package inputprocessingoutput;

import utils.ScannerUtils;

import java.util.InputMismatchException;

public class HandlingBadInput {
    public static void main(String[] args) {

        int years = 72/getValue();

        System.out.println("It will take "+ years+" years to double your initial investment.");

    }
    public static int getValue(){
        System.out.println("What is the rate of return? ");
        int value = 0;
        try {
            value = ScannerUtils.nextSingleInt();
            if (value <=0){
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println("Sorry. That's not a valid input.");
            getValue();
        }return value;

    }
}
