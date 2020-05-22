package inputprocessingoutput;

import utils.ScannerUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Magic8Ball {
    public static void main(String[] args) {
        System.out.println("What's your question?");
        String question = ScannerUtils.nextLine();
        List<String> answer = new ArrayList<>();
        answer.add("\"YES\"");
        answer.add("\"NO\"");
        answer.add("\"MAYBE\"");
        answer.add("\"Ask again later.\"");
        Random random = new Random();

        System.out.println(question + " "+ answer.get(random.nextInt(3 + 1)));
    }

}
