package inputprocessingoutput;

import utils.ScannerUtils;

public class MonthsToPayOffaCreditCard {
    public static void main(String[] args) {
        int balance;
        double apr;
        double monthlyPayment;
        int months;

        System.out.println("What is your balance?");
        balance = ScannerUtils.nextSingleInt();
        System.out.println("What is the APR on the card (as a percent)?");
        apr = ScannerUtils.nextSingleDouble();
        System.out.println("What is the monthly payment you can make?");
        monthlyPayment = ScannerUtils.nextSingleDouble();
        months = calculateMonthsUntilPaidOff(balance, apr, monthlyPayment);
        System.out.println("It will take you "+ months + " months to pay off this card.");

    }
    public static int calculateMonthsUntilPaidOff(int balance, double apr, double monthlyPayment){
        int numberOfMonths;
        double dailyRate = (apr/100)/365;
        double perDay = -0.0333333333333333333;
        numberOfMonths =(int) (perDay *(Math.log((1+((balance/monthlyPayment)*(1-Math.pow((1+dailyRate), 30)))))
                / Math.log(1+dailyRate)));
        numberOfMonths = Math.round(numberOfMonths);
        return numberOfMonths;
    }
}
