package inputprocessingoutput;

import utils.ScannerUtils;

public class ValidatingInputs {
    public static void main(String[] args) {







    }
    public static String firstName(){
        String firstName = ScannerUtils.nextLine();
        if(firstName.isEmpty()){
            firstName = "The first name must be filled in.";
        }else if(firstName.length() <2){
            firstName = "\""+ firstName+"\"" + " is not a valid first name. It is too short.";
        }return firstName;
    }
    public static String secondName(){
        String secondName=ScannerUtils.nextLine();
        if(secondName.isEmpty()){
            secondName = "The second name must be filled in.";
        }else if(secondName.length() <2){
            secondName = "\""+ secondName+"\"" + " is not a valid second name. It is too short.";
        }return secondName;
    }
    public static int zipCode(){
        int zipCode=0;
        try {
           zipCode = ScannerUtils.nextSingleInt();
        }catch (Exception e){
            System.out.println("The ZIP code must be numeric.");
        }return zipCode;
    }
    public static String employeeID(){
        String employeeID=null;
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
        System.out.println("Enter the first name: ");
        firstName();
        System.out.println("Enter the second name: ");
        secondName();
        System.out.println("Enter the ZIP code: ");
        zipCode();
        System.out.println("Enter an employee ID: ");
        employeeID();

    }

}
