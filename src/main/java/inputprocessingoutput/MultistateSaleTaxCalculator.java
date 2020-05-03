package inputprocessingoutput;

import utils.ScannerUtils;


import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class MultistateSaleTaxCalculator {
    public static void main(String[] args) {
        System.out.println("What is the order amount?");
        double amount = getAmount(0);
        System.out.println("What state do you live in?");
        String state = getNameOfState();
        DecimalFormat decimalWithTwo = new DecimalFormat("#.##");
        double taxWi = amount*5/100;
        double taxIllinois = amount*8/100;
        double countyWiEauClaire = taxWi + (amount*0.005);
        double countyWiDunn = taxWi + (amount*0.004);

        if (state.equalsIgnoreCase("Illinois")){
            double total = amount + taxIllinois;
            System.out.println("The tax is " + decimalWithTwo.format(taxIllinois) +
                    "\nThe total is "+ decimalWithTwo.format(total));
        }
        else if (state.equalsIgnoreCase("Wisconsin")){
            System.out.println("What county do you live in?");
            String county = getNameOfCounty();

            if (county.equalsIgnoreCase("Eau Claire")){
                double total = amount + countyWiEauClaire;
                System.out.println("The tax is " + decimalWithTwo.format(countyWiEauClaire) +
                        "\nThe total is "+ decimalWithTwo.format(total));
            }else if (county.equalsIgnoreCase("Dunn")){
                double total = amount + countyWiDunn;
                System.out.println("The tax is " + decimalWithTwo.format(countyWiDunn) +
                        "\nThe total is "+ decimalWithTwo.format(total));
            }else System.out.println("Please select a valid county");
        }else System.out.println("Please select a valid state!");
    }
    public static double getAmount(double a){
       try {
           a = ScannerUtils.nextSingleDouble();
           if (a <0){
               System.out.println("Please enter a valid number!");
               return getAmount(a);
           }
       }catch (Exception e){
           System.out.println("Please enter a number!");
           System.out.println("What is the order amount?");
           return getAmount(a);
       }return a;
    }
    public static String getNameOfState() {
        String state;
        state = ScannerUtils.nextLine();
        try {
            if(state.isEmpty()){
            System.out.println("Please enter a name of state");
            return getNameOfState();
            }

        }catch (Exception e){
            System.out.println("Please enter a name of state");
            return getNameOfState();
        }return state;
    }
    public static String getNameOfCounty() {
        String county;
        county = ScannerUtils.nextLine();
        try { if (county.isEmpty()){
            System.out.println("Please enter a name of county!");
            return getNameOfCounty();
            }
        }catch (Exception e){
            System.out.println("Please enter a valid name for county!");
            return getNameOfCounty();
        }return county;
    }
}
