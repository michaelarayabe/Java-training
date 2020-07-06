package generics.the_solution;

public class IntegerDuo extends Duo<Integer> {
    //Here a non generic class is inheriting a generic class which we
    // gave a data type of Integer, we can also replace it with Duo<E> but then
    // We need to also change the type of our constructor to E type instead of Integer

    public IntegerDuo(Integer first, Integer second){
        super(first, second);
    }
}
