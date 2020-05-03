package inputprocessingoutput;

import utils.ScannerUtils;

import java.util.TreeSet;


public class TroubleshootingCarIssues {
    public static void main(String[] args) {
        System.out.println("Is the car silent when you turn the key?");
        String string1 = "Are the battery terminals corroded?";
        String string2 = "Does the car make a clicking noise?";
        String string11 = "Clean terminals and try starting again.";
        String string12 = "Replace cables and try again.";
        String string21 = "Replace the battery.";
        String string22 = "Does the car crank up but fail to start?";
        String string221 = "Check spark plug connections.";
        String string222 = "Does the engine start and then die?";
        String string2221 = "Does your car have fuel injection?";
        String string22211 = "Check to ensure the choke is opening and closing.";
        String string22212 = "Get it in for service.";
    }

    public static String getYorN(){
        String letter;
        letter = ScannerUtils.nextLine();
        if (letter.equalsIgnoreCase("y") || letter.equalsIgnoreCase("n")){
            return letter;
        }else {
            System.out.println("Please enter Y or N");
            getYorN();
        }return letter;
    }
}
