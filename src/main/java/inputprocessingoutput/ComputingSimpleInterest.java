package inputprocessingoutput;

import java.text.NumberFormat;
import java.util.Scanner;

public class ComputingSimpleInterest {

    public static void main(String[] args) {
        int valueOfInvestment;
        double interestPercentage;
        System.out.println("Enter the principal amount: ");
        Scanner scanner = new Scanner(System.in);
        double principalAmount = scanner.nextDouble();
        System.out.println("Enter the rate of interest: ");
        Scanner scanner1 = new Scanner(System.in);
        double rateOfInterest = scanner1.nextDouble();
        System.out.println("Enter the number of years: ");
        Scanner scanner2 = new Scanner(System.in);
        int year = scanner2.nextInt();

        interestPercentage = rateOfInterest / 100;
        valueOfInvestment = (int) (principalAmount * (1 + interestPercentage * year ));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("After " + year + " years" + " at " + rateOfInterest + "%," + "the investment will be worth "
                + formatter.format(valueOfInvestment));

    }
}
//        Enter the principal: 1500
//        Enter the rate of interest: 4.3
//        Enter the number of years: 4
//        After 4 years at 4.3%, the investment will
//        be worth $1758.