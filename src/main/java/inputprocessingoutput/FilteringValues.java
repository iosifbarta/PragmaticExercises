package inputprocessingoutput;

import utils.ScannerUtils;

import java.util.ArrayList;
import java.util.List;

public class FilteringValues {
    public static void main(String[] args) {
        System.out.println("Enter a list of numbers, separated by spaces:");
        String str = ScannerUtils.nextLine();
        String[] list = str.split(" ");
        int number;
        List<Integer> arrayList=new ArrayList<>();
        for (String s : list) {
            number = Integer.parseInt(s);
            arrayList.add(number);
        }
        System.out.print("The even numbers are");
        numbers(filterEvenNumbers(arrayList));


    }
    public static List<Integer> filterEvenNumbers (List<Integer> list){
        int evenNumber;
        List<Integer> evenList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                evenNumber = integer;
                evenList.add(evenNumber);
            }
        }
        return evenList;
    }
    public static void numbers(List<Integer> list){
        for (Integer integer : list) {
            System.out.print(" "+integer);
        }
    }
}
