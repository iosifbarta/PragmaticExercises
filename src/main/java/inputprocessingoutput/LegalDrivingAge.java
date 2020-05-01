package inputprocessingoutput;


import java.util.Scanner;

public class LegalDrivingAge {
    public static void main(String[] args) {
        System.out.println("What is your age? ");
        int x = age(0);
        if (x < 16){
            System.out.println("You are not old enough to legally drive.");
        }else System.out.println("You are old enough to legally drive.");
    }

    public static int age(int x){
        Scanner scanner = new Scanner(System.in);
       try {
           x = scanner.nextInt();
           if(x<0){
               System.out.println("Please enter a valid number");
               return age(x);
           }
       }catch (Exception e){
           System.out.println("Please enter a valid number");
           return age(x);
       }return x;
    }
}
