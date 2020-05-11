package inputprocessingoutput;

public class PasswordStrengthIndicator {
    public static void main(String[] args) {
        passwordValidator("abc123xyz");

    }
    public static void passwordValidator(String pass){

//@"\b\w+es\b"
        if((pass.matches("(?=.*[0-9]).*")) && (pass.length() < 8)){
            System.out.println("The password " + "'"+pass+ "'" + " is a very weak password.");
        }else if ((pass.matches("(?=.*[a-z]).*") && (pass.length() < 8))){
            System.out.println("The password " + "'"+pass+ "'" + " is a weak password.");

        }
        if ((pass.matches("(?=.*[0-9][a-z][~!@#$%^&*()_-]).*"))  && (pass.length() >=8)){
            System.out.println("The password " + "'" + pass+ "'" + " is a very strong password.");

        }else if ((pass.matches("(?=.*[0-9][a-z]).*")) && (pass.length() >=8)){
            System.out.println("The password " + "'" + pass+ "'" + " is a strong password.");
        }
    }
}
