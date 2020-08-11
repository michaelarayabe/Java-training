package learning.stream.demo_2;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamDemo2 {

    public static void main(String[] args) {

/*
        IntStream.rangeClosed(1, 50)
                .filter(e -> e % 2 == 0)
                .filter(e -> e % 3 == 0)
                .filter(e -> e > 10)
                .limit(4)
                .map(e -> e * 5)
                .mapToDouble(e ->e/1.5) // changed to double stream
                .mapToInt(e -> (int)e)
                //.findFirst()
                //.map(e -> e * 5)
                //.getAsInt();
                .forEach(e -> System.out.println(e));
*/
        IntStream.generate(() -> new Random().nextInt(100))
                .limit(100)
                .sorted()
                .forEach(e -> System.out.println(e));

    }
}
