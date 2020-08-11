package playground.lambda_practise.construc;

import java.util.Arrays;
import java.util.List;

public class Some {

    public static void main(String[] args) {

        List<String> someStr = Arrays.asList("Sol", "Ninja", "Parot", "somt");
        someStr.forEach(System.out::println);
    }
}
