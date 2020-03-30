package inputprocessingoutput;

import java.util.Scanner;

public class DeterminingCompoundInterest {
    public static void main(String[] args) {

        double finalAmountAtTheEnd;
        double anualRate;

        double percentageRate;
        System.out.println("What is the principal amount?");
        Scanner scanner = new Scanner(System.in);
        int principalAmount = scanner.nextInt();
        System.out.println("What is the rate?");
        Scanner scanner1 = new Scanner(System.in);
        double rate = scanner1.nextDouble();
        System.out.println("What is the number of years?");
        Scanner scanner2 = new Scanner(System.in);
        int years = scanner2.nextInt();
        System.out.println("What is the number of times the interest is compounded per year?");
        Scanner scanner3 = new Scanner(System.in);
        int compoundPerYear = scanner3.nextInt();

        anualRate = rate/100;
        double intermediarCalculation = 1 + anualRate / compoundPerYear;
        int i = compoundPerYear * years;

    }


}
//          What is the principal amount? 1500
////        What is the rate? 4.3
////        What is the number of years? 6
////        What is the number of times the interest
////        is compounded per year? 4
////        $1500 invested at 4.3% for 6 years
////        compounded 4 times per year is $1938.84.