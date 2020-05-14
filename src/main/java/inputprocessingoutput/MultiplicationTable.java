package inputprocessingoutput;

public class MultiplicationTable {
    public static void main(String[] args) {
        int value;
     int firstNumber;
     int secondNumber;
        for( firstNumber=0; firstNumber<=12;firstNumber++){
            for (secondNumber=0; secondNumber<=12;secondNumber++){
                value = firstNumber * secondNumber;
                System.out.println(firstNumber + " X " + secondNumber + " = "+value);
            }
        }
    }
}
