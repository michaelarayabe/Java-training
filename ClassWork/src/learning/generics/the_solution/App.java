package learning.generics.the_solution;

public class App {

    public static void main(String[] args) {

        Duo<Integer> someInt = new Duo<>(6,8);

        Integer x = someInt.getFirst(); // casting is avoided here
        System.out.println(x); //Outputs the first integer 6

        Duo<String> someStr = new Duo<>("Hello", "World");

        String firstWord = someStr.getFirst();
        String secondWord = someStr.getSecond();

        System.out.println(firstWord + " " + secondWord); //Out puts "Hello World"

        MyNumberDuo<Integer> nd1 = new MyNumberDuo<>(2,3);
        MyNumberDuo<Double> nd2 = new MyNumberDuo<>(2.1,3.2);
        MyNumberDuo<Float> nd3 = new MyNumberDuo<>(3.2F,1.2F);

        ComparableDuo<Integer> nd4 = new ComparableDuo<>(2,3);
        ComparableDuo<Double> nd5 = new ComparableDuo<>(2.1,3.2);
        ComparableDuo<Float> nd6 = new ComparableDuo<>(3.2F,1.2F);

        //DuoUtility duoUtility = new Duo<String>("Hello", "World");
        //System.out.println(duoUtility.toString());
        System.out.println();
        Duo<String> some = new Duo<>("Hello", "Guys");
        DuoUtility.printUpper(some);


    }
}
