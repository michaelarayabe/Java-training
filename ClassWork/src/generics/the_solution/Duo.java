package generics.the_solution;

public class Duo<E> {

    private E first;
    private E second;

    //Constructor
    public Duo(E first, E second){

        this.first = first;
        this.second = second;
    }

    public E getFirst(){
        return first;
    }

    public E getSecond(){
        return second;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public void swap(){
        E temp = second;
        second = first;
        first = temp;
    }
}
