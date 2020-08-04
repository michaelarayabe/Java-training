package generics.the_solution;

public class MyNumberDuo <E extends Number & Comparable<E>> extends Duo<E> {

    // Here our generic class with limited type inheriting a generic class
    public MyNumberDuo(E first, E second){
        super(first, second);
    }

}
