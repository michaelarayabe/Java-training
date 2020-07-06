package generics.example_on_interface;

public interface Pair<E> {

    //Abstract Methods

     E getLeft();
     E getRight();
     void setLeft(E left);
     void setRight(E right);

    //Default Methods
     default void swap(){
        E temp = getLeft();
        setLeft(getRight());
        setRight(temp);
    }
}
