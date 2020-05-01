package inputprocessingoutput;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("C:\\Users\\Iosif.Barta\\FastTrackIT\\pragmaticExercises\\src\\main\\java\\inputprocessingoutput\\exercise 6 - input.txt"));
        int testCasesCount = scanner.nextInt();

        for (int i = 1; i<= testCasesCount; i++){
            int arraylLenght = scanner.nextInt();

            int[]numbers = new int[arraylLenght];
            for (int j=0; j<arraylLenght;j++){
                numbers[j]=scanner.nextInt();
            }
        }
    }
}
