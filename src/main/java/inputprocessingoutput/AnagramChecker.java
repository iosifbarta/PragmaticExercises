package inputprocessingoutput;

import utils.ScannerUtils;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.println("Enter the first string:");
        String firstString = ScannerUtils.nextLine();
        System.out.println("Enter the second string:");
        String secondString = ScannerUtils.nextLine();
        if (isAnagram(firstString, secondString)){
            System.out.println(firstString + " and " + secondString + " are anagram");
        }else System.out.println(firstString + " and " + secondString + " are not anagram");
    }

    public static boolean isAnagram (String firstString, String secondString){
        int lenght1 = firstString.length();
        int lenght2 = secondString.length();
        if (lenght1 != lenght2)
        {return false;}

        char[] firstWord = firstString.toCharArray();
        char[] secondWord = secondString.toCharArray();
        Arrays.sort(firstWord);
        Arrays.sort(secondWord);
        for (int i=0; i<lenght1; i++)
        {if (firstString.charAt(i) != secondString.charAt(i))
                return false;
        }return true;
    }
}
