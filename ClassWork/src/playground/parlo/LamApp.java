package playground.parlo;

public class LamApp {

    public static void main(String[] args) {

        Lamtry lt = new Lamtry("This is the sentence we are going to experiment on");
        lt.printWithFilter((String s) -> {
            return s.startsWith("a");});

    }
}
