package learning.stream.demo_1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        String[] strArray = "This is array of string that is getting long".split(" ");

        //Externe Iterator
        for(String s : strArray){
            System.out.println(s);
        }

        System.out.println("----------");
        Stream.of(strArray).forEach(element -> System.out.println(element));

        System.out.println("----------");

        Stream<String> stream = Stream.of(strArray);

        stream.forEach(e -> System.out.println(e));

        System.out.println("----------");
        //Bron: bv Array

        //Stream.generate(() -> "Hello world").limit(100).forEach(e -> System.out.println(e));

        System.out.println("----------");

        //Stream.generate(() -> new Random().nextInt(100)).limit(100).forEach(e -> System.out.println(e));

        //Stream<String> stringStream;
        //IntStream intStream;
        //LongStream longStream;
        //DoubleStream doubleStream;

        System.out.println("----------");


        //IntStream.iterate(0,e -> e +1).limit(100).forEach(e -> System.out.println(e));

        strArray = "This is array of string that is getting long".split(" ");

        OptionalDouble sum = IntStream.of().average();
        OptionalDouble sum2 = IntStream.rangeClosed(0,10).average();


        if(sum.isPresent()){
            System.out.println(sum);
        }else{
            System.out.println("Sum is not present");
        }

        if(sum2.isEmpty()){
            System.out.println("Sum is empty");
        }else{
            System.out.println(sum2.getAsDouble());
        }

        //4! = 4 * 3 * 2 * 1

        //int number = IntStream.rangeClosed(1,4).reduce(1,(acc, e) -> acc * e);
        //System.out.println(number);


        //String sentence = Stream.of(strArray).reduce("", (acc, e) -> acc + e + " ");
        //System.out.println(sentence);

        int[] intArray = IntStream.rangeClosed(0,20).toArray();

        /*
        for(int i : intArray){
            System.out.println(i);
        }*/

        IntStream.of(intArray).forEach(e -> System.out.println(e));


    }
}
