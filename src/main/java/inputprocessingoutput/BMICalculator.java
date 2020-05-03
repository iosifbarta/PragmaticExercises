package inputprocessingoutput;

import utils.ScannerUtils;

public class BMICalculator {
    public static void main(String[] args) {
        System.out.println("Please enter your weight");
        double weightPounds = getWeight(0) * 2.2;
        System.out.println("Please enter your height");
        double heightInch = getHeight(0) * 0.3937;
        double bmi;
        bmi = (weightPounds / (heightInch*heightInch)) * 703;
        System.out.println("Your BMI is " + bmi);
        if(bmi < 18.5 && bmi > 0){
            System.out.println("You are underweight");
        }else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("You are within the ideal weight range.");
        }else if(bmi >= 25 && bmi <= 29.9){
            System.out.println("You are overweight. You should see your doctor.");
        }else if(bmi>30){
            System.out.println("You have obesity. You should see your doctor.");
        }else System.out.println("Check the weight and height value");
    }

    public static double getWeight(double w){
     try {
         w = ScannerUtils.nextSingleDouble();
         if(w <0){
             System.out.println("Please enter a valid value");
             return getWeight(w);
         }
     }catch (Exception e){
         System.out.println("Please enter a valid number");
         return getWeight(w);
     }return w;
    }
    public static double getHeight (double h){
        try {
            h = ScannerUtils.nextSingleDouble();
            if(h<0){
                System.out.println("Please enter a valid value");
                return getHeight(h);
            }
        }catch (Exception e){
            System.out.println("Please enter a valid number");
            return getHeight(h);
        }return h;
    }
}
