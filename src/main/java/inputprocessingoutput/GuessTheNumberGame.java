package inputprocessingoutput;

import utils.ScannerUtils;



public class GuessTheNumberGame {
    public static void main(String[] args) {

        System.out.println("Let's play Guess the Number.");
        int level = pickLevel();
        int number = generateNumber(level);
//        System.out.println(number);
        System.out.println("I have my number. What's your guess?");
        game(number);
        replay();



    }

    public static int pickLevel() {
        int getLevel = 0;
        System.out.println("Pick a difficulty level (1, 2, or 3): ");
        try {
            getLevel = ScannerUtils.nextSingleInt();
            if ((getLevel < 1) || (getLevel > 3)) {
                System.out.println("Please enter a number from 1 to 3");
                pickLevel();
            }
        } catch (Exception e) {
            System.out.println("Please enter a number from 1 to 3");
            pickLevel();
        }
        return getLevel;
    }

    public static int generateNumber(int level) {
        int generateNumber = 0;
        if (level == 1) {
            generateNumber = (int) (Math.random() * (10 - 1));
        } else if (level == 2) {
            generateNumber = (int) (Math.random() * (100 - 1));
        } else if (level == 3) {
            generateNumber = (int) (Math.random() * (1000 - 1));
        }
        return generateNumber;
    }

    public static void game(int number) {
        int countInputs = 0;
        int inputNumber = 0;

        while (inputNumber!=number){
            countInputs++;
            try {
                inputNumber=ScannerUtils.nextSingleInt();
            }catch (Exception e){
                System.out.println("Please enter a number");
                continue;
            }

        if (inputNumber < number) {
                System.out.println("Too low. Guess again:");
            }
        if (inputNumber > number) {
                System.out.println("Too high. Guess again:");
            }
        }
        System.out.println("You got it in " + countInputs + " guesses!");
        if (countInputs == 1){
            System.out.println("“You’re a mind reader!”");
        }
        if (countInputs==2 || countInputs==3){
            System.out.println("“Most impressive.”");
        }
        if (countInputs==4 || countInputs<=6){
            System.out.println("“You can do better than that.”");
        }else System.out.println("“Better luck next time.”");
    }
    public static void replay(){
        System.out.println("Play again?");
        String answer = ScannerUtils.nextLine();
        if (answer.equalsIgnoreCase("y")){
            System.out.println("Let's play again");
        }else System.out.println("Goodbye!!");
    }
}

