package inputprocessingoutput;

import utils.ScannerUtils;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Press C to convert from Fahrenheit to Celsius." +
                " \nPress F to convert from Celsius to Fahrenheit.");
        String cOrF = celsiusOrFahrenheit();
        if(cOrF.equalsIgnoreCase("F")){
        System.out.println("Please enter the temperature in Celsius: ");
        double temp = getTemperature(0);
        double fahrenheit = (temp * 9/5)+32;
            System.out.println("The temperature in Fahrenheit is: "+fahrenheit);
        }
        if(cOrF.equalsIgnoreCase("C")){
            System.out.println("Please enter the temperature in Fahrenheit: ");
            double temp = getTemperature(0);
            double celsius = (temp -32)*5/9;
            System.out.println("The temperature in Celsius is: "+celsius);
        }


    }
    public static String celsiusOrFahrenheit(){
        String letter;
        try {
            letter = ScannerUtils.nextLine();
            if (!letter.equalsIgnoreCase("C") && !letter.equalsIgnoreCase("F")){
                System.out.println("Please enter \"C\" or \"F\".");
                return celsiusOrFahrenheit();
            }
        }catch (Exception e){
            System.out.println("Please enter \"C\" or \"F\".");
            return celsiusOrFahrenheit();
        }
        System.out.println("Your choice is "+ letter);
        return letter;
    }
    public static double getTemperature (double temp){
       try {
           temp = ScannerUtils.nextSingleDouble();
       }catch (Exception e){
           System.out.println("Please enter a valid number");
           return getTemperature(temp);
       }return temp;
    }
}
