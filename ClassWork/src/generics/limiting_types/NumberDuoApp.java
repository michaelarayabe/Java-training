package generics.limiting_types;

public class NumberDuoApp {
    public static void main(String[] args) {

        NumberDuo<Integer> nd1 = new NumberDuo<>(5,9);
        NumberDuo<Double> nd2  = new NumberDuo<>(2.1,9.1);
        NumberDuo<Number> nd3 = new NumberDuo<>(3.1,4);
        NumberDuo<?> nd = new NumberDuo<>(2.4F,1.1F);

        System.out.println(nd1.getSum()); // 14.0
        System.out.println(nd2.getSum()); //11.2
        System.out.println(nd3.getSum()); //7.1
        System.out.println(nd.getSum());
        //nd.setFirst(new Float(8F)); Not allowed here

    }
}
