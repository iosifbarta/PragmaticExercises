package inputprocessingoutput;

import utils.ScannerUtils;

import java.text.NumberFormat;

public class KarvonenHeartRate {
    public static void main(String[] args) {

        int targetHR;
        int age =getAge();
        int restingHR =getRestingHR();
        int intensity;
        for (intensity=55; intensity<=95;intensity+=5){
            targetHR = (((220-age)-restingHR)*intensity/100)+restingHR;
            System.out.println(intensity + "%" + " = "+ targetHR);
        }
    }
    public static int getAge(){
        System.out.println("Please enter your age.");
        int age = 0;
        try {
             age= ScannerUtils.nextSingleInt();
        }catch (Exception e){
            System.out.println("Please enter a number!");
            getAge();
        }return age;
    }
    public static int getRestingHR(){
        System.out.println("Please enter your age.");
        int restingHR = 0;
        try {
            restingHR= ScannerUtils.nextSingleInt();
        }catch (Exception e){
            System.out.println("Please enter a number!");
            getRestingHR();
        }return restingHR;
    }
}
