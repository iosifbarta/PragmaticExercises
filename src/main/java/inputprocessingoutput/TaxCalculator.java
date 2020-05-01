package inputprocessingoutput;
//What is the order amount? 10
//        What is the state? WI
  //      The subtotal is $10.00.
//        The tax is $0.55.
//        The total is $10.55.
//        Or
//        What is the order amount? 10
//        What is the state? MN
//        The total is $10.00

import utils.ScannerUtils;

import java.text.NumberFormat;
import java.util.Locale;

public class TaxCalculator {
    public static void main(String[] args) {
        System.out.println("What is the order amount?");
        double amount = ScannerUtils.nextSingleDouble();
        System.out.println("What is the state?");
        String state = ScannerUtils.nextLine();
        String stateWi = "WI";
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        String currency = format.format(amount);
        double valueOfTax = 0.55;
        double tax = (amount + amount * valueOfTax/10);
        if (state.equals(stateWi)){
            System.out.println("The subtotal is " + currency);
            System.out.println("The tax is " + format.format(valueOfTax) + "\nThe total is " + format.format(tax)+".");
        }
        System.out.println("The total is "+format.format(tax));
    }
}
