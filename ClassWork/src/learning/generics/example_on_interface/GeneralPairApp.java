package learning.generics.example_on_interface;

public class GeneralPairApp {

    public static void main(String[] args) {
        Shoe right = new Shoe();
        Shoe left = new Shoe();

        GeneralPair<Shoe> pair = new GeneralPair<>(left, right);
        System.out.println(pair);
    }
}
