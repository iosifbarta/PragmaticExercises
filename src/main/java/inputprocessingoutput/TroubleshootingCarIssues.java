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

        String answer = getYorN();
        if(answer.equalsIgnoreCase("y")){
            System.out.println(string1);
            String answer1 = getYorN();
            if (answer1.equalsIgnoreCase("y")){
                System.out.println(string11);
            }else if (answer1.equalsIgnoreCase("n")){
                System.out.println(string12);
            }
        }if (answer.equalsIgnoreCase("n")){
            System.out.println(string2);
            String answer2 = getYorN();
            if (answer2.equalsIgnoreCase("n")){
                System.out.println(string22);
                String answer3 = getYorN();
                if (answer3.equalsIgnoreCase("n")){
                    System.out.println(string222);
                    String answer4 = getYorN();
                    if (answer4.equalsIgnoreCase("y")){
                        System.out.println(string2221);
                        String answer5=getYorN();
                        if (answer5.equalsIgnoreCase("y")){
                            System.out.println(string22211);
                        }else System.out.println(string22212);
                    }else System.out.println(string22212);
                }else System.out.println(string221);
            }else System.out.println(string21);
        }
    }

    public static String getYorN(){
        String letter = ScannerUtils.nextLine();
        if ((letter.equalsIgnoreCase("y")) || (letter.equalsIgnoreCase("n"))){
            return letter;
        }else {
            System.out.println("Please enter Y or N");
            return getYorN();
        }
    }
}
