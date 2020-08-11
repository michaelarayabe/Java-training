package learning.lambda.demo_5;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        //static method reference

        List<Integer> numbers = Arrays.asList(1,254,5,8954, 7845, 1410, 5);

        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        System.out.println();

        for(Integer number : numbers){
            System.out.println(number);
        }

        System.out.println();

        numbers.forEach(System.out::println);

        System.out.println();

        //Instance Method reference

        FaultySoftware bug = new FaultySoftware();
        numbers.forEach(bug::printAllNumbers); //HERE

        //Constructor reference

        String original = "Hello";
        System.out.println("\n *** scrambled content ***");
        Scrambler scrambler = new Scrambler(original, 42);
        //scrambler.parse(Integer::new);

        System.out.println(Arrays.toString(scrambler.getScrambled()));
    }
}
