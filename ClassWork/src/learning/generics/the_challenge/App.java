package learning.generics.the_challenge;

public class App {
    public static void main(String[] args) {

        String s = "Hello World";
        Integer i = 7;

        Duo d = new Duo(s, i);

        Integer i1 = 5;
        Integer i2 = 5;

        Duo k  = new Duo(5, 5);
        Integer f = (Integer) k.getFirst();
        //We can solve this issue using Generics (We can avoid casting).
        System.out.println(f);
    }
}
