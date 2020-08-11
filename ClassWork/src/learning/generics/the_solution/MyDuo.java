package learning.generics.the_solution;

public class MyDuo<E> extends Duo<E> {

    //Here our generic class inheriting another generic class

    public MyDuo(E first, E second){
        super(first,second);
    }
}
