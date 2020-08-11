package exercises;

public class App {

    public static void main(String[] args) {


        double[] firstList = {1,2,3,4,5,6,7,8,9,10};
        double[] secondList = {1.1,2.3,3.1,4.2,5.3,6.1,7.1,8.0,9.2,10.3};

        System.out.println("De som van de waarden in de array:\n " + LambdaTest.sum.apply(firstList));


        System.out.println("De gemiddelde van de waarden in de array:\n " + LambdaTest.gemiddelde.apply(firstList));
        System.out.println("de maximale waarde in de array:\n " + LambdaTest.maximale.apply(firstList));
        System.out.println("de minnimal waarde in de array:\n " + LambdaTest.minimumwaarde.apply(firstList));


        System.out.println(LambdaTest.counter(10).apply(firstList));
    }
}
