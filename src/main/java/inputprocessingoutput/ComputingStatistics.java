package inputprocessingoutput;



import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComputingStatistics {
    public static void main(String[] args) {
        List<Integer> values = numbers();
        System.out.println("Numbers: " + values.get(0)+", "+values.get(1)+", "+ values.get(2)+", "
            +values.get(3));
        double sum = 0;
        for (Integer value : values) sum += value;
        double average = sum/values.size();
        System.out.println(average);
        Collections.sort(values);
        Integer min = values.get(0);
        Integer max = values.get(values.size()-1);
        double numerator = Math.pow((values.get(0)-average), 2) +Math.pow((values.get(1)-average),2)
                            +Math.pow((values.get(2)-average),2)+Math.pow((values.get(3)-average),2);
        double standardDeviation = Math.sqrt(numerator/(values.size()-1));
        String decimalFormat = new DecimalFormat("#.##").format(standardDeviation);
        System.out.println("The average is "+ average+".");
        System.out.println("The minimum is "+ min+".");
        System.out.println("The maximum is "+ max+".");
        System.out.println("The standard deviation is: "+decimalFormat+".");
    }

    public static List<Integer> numbers(){
        List<Integer> list = new ArrayList<>();
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        while (scanner.hasNextInt()){
            System.out.println("Enter a number:");
            number = scanner.nextInt();
            list.add(number);
        }
        scanner.nextLine();
        return list;
    }
}
