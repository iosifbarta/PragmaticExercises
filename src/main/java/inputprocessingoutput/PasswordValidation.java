package inputprocessingoutput;

import utils.ScannerUtils;

public class PasswordValidation {
    public static void main(String[] args) {
        System.out.println("What is the password?");
        String pass = "abc$123";
        String typingPass = ScannerUtils.nextLine();
        if(pass.equals(typingPass)){
            System.out.println("Welcome!");
        }else System.out.println("I don't know you.");
    }
}
