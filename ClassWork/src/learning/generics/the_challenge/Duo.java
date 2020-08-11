package learning.generics.the_challenge;

public class Duo {
    private Object first;
    private Object second;

    public Duo(Object first, Object second){
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

    public void swap(){
        Object temp = second;
        second = first;
        first = temp;
    }
}
