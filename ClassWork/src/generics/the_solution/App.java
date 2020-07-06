package generics.the_solution;

public class App {

    public static void main(String[] args) {

        Duo<Integer> someInt = new Duo<>(6,8);

        Integer x = someInt.getFirst(); // casting is avoided here
        System.out.println(x); //Outputs the first integer 6

        Duo<String> someStr = new Duo<>("Hello", "World");

        String firstWord = someStr.getFirst();
        String secondWord = someStr.getSecond();

        System.out.println(firstWord + " " + secondWord); //Out puts "Hello World"
    }
}
