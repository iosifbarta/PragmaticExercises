package inputprocessingoutput;

import java.time.Year;
import java.util.Scanner;

public class RetirementCalculator {
    public static void main(String[] args) {
//        What is your current age? 25
//        At what age would you like to retire? 65
//        You have 40 years left until you can retire.
//        It's 2015, so you can retire in 2055.
        System.out.println("What is your current age?");
        Scanner scanner = new Scanner(System.in);
        String currentAge = scanner.nextLine();
        System.out.println("At what age would you like to retire?");
        Scanner scanner1 = new Scanner(System.in);
        String retireAge = scanner1.nextLine();
        int output = myStringToNumber(currentAge);
        int output1 = myStringToNumber(retireAge);
        int ageUntilRetire = output1 - output;
        Year year = Year.now();
        String yearInThisMoment = year.toString();
        int yearNow = myStringToNumber(yearInThisMoment);
        int  yearsUntilRetire = yearNow + ageUntilRetire;
        if (ageUntilRetire < 0) {
            System.out.println("You already can retire");}
         else{
        System.out.println("You have " + ageUntilRetire + " years left until you can retire.");
        System.out.println("It's " + yearInThisMoment + ", so you can retire in " + yearsUntilRetire);
    }

    }
    private static int myStringToNumber (String line){
        int answer = 0, factor = 1;
        for (int i = line.length() - 1; i >= 0; i--){
            answer += (line.charAt(i) - '0') * factor;
            factor *= 10;
        }
        return answer;
    }
}
