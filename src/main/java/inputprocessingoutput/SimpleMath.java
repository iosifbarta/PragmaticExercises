package inputprocessingoutput;

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        System.out.println("What is the first number?");
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.nextLine();
        System.out.println("What is the second number?");
        Scanner scanner1 = new Scanner(System.in);
        String secondNumber = scanner1.nextLine();
        System.out.println();
        int output = myStringToNumber(firstNumber);
        int output1 = myStringToNumber(secondNumber);
        int adunare = output + output1;
        int scadere = output - output1;
        int inmultire = output * output1;
        int impartire = output / output1;
        System.out.println(output + " + " + output1 + " = " + adunare);
        System.out.println(output + " - " + output1 + " = " + scadere);
        System.out.println(output + " * " + output1 + " = " + inmultire);
        System.out.println(output + " / " + output1 + " = " + impartire);


    }
    private static int myStringToNumber (String line){ int answer = 0, factor = 1;
        for (int i = line.length() - 1; i >= 0; i--){
            answer += (line.charAt(i) - '0') * factor;
            factor *= 10;
        }
        return answer;
    }

//    What is the first number? 10
////    What is the second number? 5
////            10 + 5 = 15
////            10 - 5 = 5
////            10 * 5 = 50
////            10 / 5 = 2


}
