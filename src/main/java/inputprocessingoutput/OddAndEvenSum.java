package inputprocessingoutput;

import java.util.Scanner;

public class OddAndEvenSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCasesCount = scanner.nextInt();
        int[] maxNumbers = new int[testCasesCount];

        for (int i =0; i < testCasesCount; i++){
        maxNumbers[i] = scanner.nextInt();
        }
        for (int number : maxNumbers){
            int oddSum = 0;
            int evenSum = 0;
            for (int i=0; i <= number; i++){
                if(i % 2 == 0){
                    evenSum +=i;
                }else {
                    oddSum +=i;
                }
            }
            System.out.println(evenSum + " " + oddSum);
        }
    }
}