package generics.example_on_interface;

public class App {

    public static void main(String[] args) {

        Shoe leftShoe = new Shoe();
        Shoe rightShoe = new Shoe();

        Pair<Shoe> pair = new ShoePair(leftShoe, rightShoe);
        System.out.println(pair.getLeft() + " " + pair.getRight());

        pair.swap();
        System.out.println(); //new line

        System.out.println(pair.getLeft() + " " + pair.getRight());


    }
}
