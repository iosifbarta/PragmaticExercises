package inputprocessingoutput;

import utils.ScannerUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class PickingAWinner {
    public static void main(String[] args) {

    List<String> names = collectNames();

        Random random = new Random();
        String winner =names.get(random.nextInt(names.size() + 1));
        System.out.println("The winner is..." + winner);

    }
    public static List<String> collectNames(){
        List<String> getNames = new ArrayList<>();
        String name;
        do {
            System.out.println("Enter a name: ");
            name = ScannerUtils.nextLine();
            getNames.add(name);
            if (name.isEmpty()){
                getNames.remove(name);
            }
        }while (!name.isEmpty());
        return getNames;
    }
}
