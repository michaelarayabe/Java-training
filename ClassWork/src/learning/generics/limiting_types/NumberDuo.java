package learning.generics.limiting_types;

public class NumberDuo<E extends Number> {
    //Meaning the type E must be a member of Number class
    //So it can be Double, Byte, Integer, Short, Number but not String for instance
    private E first;
    private E second;

    public NumberDuo(E first, E second){
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public double getSum(){
        return first.doubleValue() + second.doubleValue();
    }
}
