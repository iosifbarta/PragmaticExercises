package inputprocessingoutput;

import utils.ScannerUtils;


public class AddingNumbers {
    public static void main(String[] args) {

        String number;
        int sum = 0;
        int numberOfLoops;
        System.out.println("Please enter how many numbers you want to add: ");

        numberOfLoops = getNumberOfLoops();



        for(int i=0; i<numberOfLoops; i++){
            System.out.println("Enter a number: ");
            number = ScannerUtils.nextLine();
            if (number.isEmpty())continue;
            sum += Integer.parseInt(number);}
        System.out.println("The total is "+ sum + ".");
    }
    public static int getNumberOfLoops(){

        int numberOfLoops;
        try {
            numberOfLoops = ScannerUtils.nextSingleInt();

            if(numberOfLoops<=0){
                System.out.println("Please enter a bigger number than 0");
                return getNumberOfLoops();
            }
        }catch (Exception e){
            System.out.println("Please enter a valid number!");
            return getNumberOfLoops();
        }return numberOfLoops;
    }
}
