package inputprocessingoutput;

import java.util.Scanner;

public class CurrencyConversion {
    public static final double currentExchangeToUS = 100;
    public static void main(String[] args) {
        double amountTo; //in US dollars
//        double amountFrom; //amount in euros
//        double rateFrom; //current exchange rates in euros
//        double rateTo; //current exchange rates of US dollars

        System.out.println("How many euros are you exchanging?");
        Scanner scanner = new Scanner(System.in);
        double amountFrom = scanner.nextDouble();
        System.out.println("What is the exchange rate?");
        Scanner scanner1 = new Scanner(System.in);
        double rateFrom = scanner1.nextDouble();
        amountTo = amountFrom * rateFrom / currentExchangeToUS;


        System.out.println(amountFrom + " euros at an exchange rate of " + rateFrom + " is " + amountTo + " U.S. dollars.");

    }
}
//    Example Output
//        How many euros are you exchanging? 81
//        What is the exchange rate? 137.51
//        81 euros at an exchange rate of 137.51 is
//        111.38 U.S. dollars.