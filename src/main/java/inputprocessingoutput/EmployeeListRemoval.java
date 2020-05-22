package inputprocessingoutput;

import utils.ScannerUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EmployeeListRemoval {
    public static void main(String[] args) {

        List<String> employeeList  = new ArrayList<>(Arrays.asList("John Smith", "Jackie Jackson","Chris Jones",
                "Amanda Cullen","Jeremy Goodwin"));

        Iterator<String> iterator = employeeList.iterator();
        String names = removeName();
        while (iterator.hasNext()){
            String name = iterator.next();
            if (name.equalsIgnoreCase(names)){
                iterator.remove();
                System.out.println("There are "+ employeeList.size() + " employee ");
                for (String value : employeeList) {
                    System.out.println(value);
                }
            }
        }
    }
    public static String removeName(){
        String name;
        System.out.println("Enter an employee name to remove:");
        name = ScannerUtils.nextLine();
        return name;
    }
}
