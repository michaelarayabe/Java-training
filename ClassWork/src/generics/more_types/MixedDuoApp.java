package generics.more_types;

public class MixedDuoApp {

    public static void main(String[] args) {
        MixedDuo<Integer, String> mixingTypes = new MixedDuo<>(3, "Hello");
        Integer myInt = mixingTypes.getFirst();
        String myStr = mixingTypes.getSecond();

        System.out.println(myStr + " " + myInt); //Outputs Hello 3
    }
}
