package learning.lambda.demo_4;

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
    }
}
