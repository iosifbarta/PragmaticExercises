package inputprocessingoutput;

import utils.ScannerUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PasswordGenerator {
    public static void main(String[] args) {

        int lengthPassword=getPasswordLength();

        String character;
        System.out.println("How many special characters?");
        int specialCharacterLength = ScannerUtils.nextSingleInt();
        System.out.println("How many numbers?");
        int numbersLength=ScannerUtils.nextSingleInt();
        String number;
        int lettersLength = lengthPassword-specialCharacterLength-numbersLength;
        String letters;
        List<String> password = new ArrayList<>();
        for(int i=0; i<specialCharacterLength; i++){
            character= getRandomCharacter();
            password.add(character);}
        for (int j=0; j<numbersLength;j++){
            number=getRandomNumber();
            password.add(number);}
        for (int k=0;k<lettersLength;k++){
            letters = getRandomLetter();
            password.add(letters);
            }
        Collections.shuffle(password);
        System.out.println("Your password is");
        for (String s : password) {
            System.out.print(s);
        }

    }
    public static String getRandomCharacter(){
        List<String> specialCharacter = new ArrayList<>();
        specialCharacter.add("!");
        specialCharacter.add("#");
        specialCharacter.add("$");
        specialCharacter.add("%");
        specialCharacter.add("^");
        specialCharacter.add("&");
        specialCharacter.add("*");
        specialCharacter.add("?");
        specialCharacter.add("/");
        int index = new Random().nextInt(specialCharacter.size());
        return specialCharacter.get(index);
    }
    public static String getRandomNumber(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        int index = new Random().nextInt(numbers.size());
        return  String.valueOf(numbers.get(index));
    }
    public static String getRandomLetter(){
        String letters = "abcdefghijklmnopqrstuvwxyz";
        Random r = new Random();
        char letter = letters.charAt(r.nextInt(letters.length()));
        return Character.toString(letter);
    }
    public static int getPasswordLength(){

        int lengthPassword = 0;
        try {
            System.out.println("What's the minimum length?");
            lengthPassword = ScannerUtils.nextSingleInt();
            if (lengthPassword>=4 && lengthPassword < 13){
                 lengthPassword =ThreadLocalRandom.current().nextInt(lengthPassword,12);
                }else if (lengthPassword>12 && lengthPassword < 17){
                lengthPassword=ThreadLocalRandom.current().nextInt(lengthPassword,16);
            }else throw new Exception();
        }catch (Exception e){
            System.out.println("Length of password must be between 4-16 characters");
            getPasswordLength();

        }return lengthPassword;
    }

}
