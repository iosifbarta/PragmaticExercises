package inputprocessingoutput;

import utils.ScannerUtils;

public class ValidatingInputs {
    public static void main(String[] args) {

        validateInput();

    }
    public static String firstName(){
        System.out.println("Enter the first name: ");
        String firstName = "";
        try {
            firstName = ScannerUtils.nextLine();

        if(firstName.isEmpty()){
            firstName = "The first name must be filled in.";
        }else if(firstName.length() <2) {
            firstName = "\"" + firstName + "\"" + " is not a valid first name. It is too short.";
        }
        }catch (Exception e){
            System.out.println("Please enter a valid first name!");
        }
        return firstName;
    }
    public static String secondName(){
        System.out.println("Enter the second name: ");
        String secondName="";
        try {
            secondName=ScannerUtils.nextLine();

        if(secondName.isEmpty()){
            secondName = "The second name must be filled in.";
        }else if(secondName.length() <2) {
            secondName = "\"" + secondName + "\"" + " is not a valid second name. It is too short.";
        }
        }catch (Exception e){
            System.out.println("Please enter a valid second name!");
        }return secondName;
    }
    public static String zipCode(){
        System.out.println("Enter the ZIP code: ");
        String zipCode;
        try {
           zipCode = ScannerUtils.nextLine();
           if(!zipCode.matches(".*?([0-9]).*?")){
               throw new Exception();
            }
        }catch (Exception e){
            zipCode = "The ZIP code must be numeric.";
        }return zipCode;
    }
    public static String employeeID(){
        System.out.println("Enter an employee ID: ");
        String employeeID="";
        try {employeeID = ScannerUtils.nextLine();
            if (!employeeID.matches(".*?([A-Z]{2})([-])([0-9]{4}).*?"))
        {
            throw new Exception();
        }
        }catch (Exception e){
            employeeID = "\""+employeeID+"\""+ " is not a valid ID.";
        }return employeeID;
    }
    public static void validateInput(){
        String firstAnswer = firstName();
        String secondAnwer = secondName();
        String thirdAnswer = zipCode();
        String fourAnswer = employeeID();
        if(firstAnswer.length()>=2 && secondAnwer.length()>=2 && thirdAnswer.matches(".*?([0-9)]).*?")
            && fourAnswer.matches(".*?([A-Z]{2})([-])([0-9]{4}).*?")){
            System.out.println("There were no errors found.");
        }else {
            System.out.println(firstAnswer);
            System.out.println(secondAnwer);
            System.out.println(thirdAnswer);
            System.out.println(fourAnswer);
        }




    }

}
