package generics.example_on_interface;

public class GeneralPair<E> implements Pair<E> {
    //Here we can use Generic classes that implements generic interfaces

    private E left;
    private E right;

    public GeneralPair(E left, E right){
        this.left = left;
        this.right = right;
    }

    @Override
    public E getLeft() {
        return left;
    }

    @Override
    public E getRight() {
        return right;
    }

    @Override
    public void setLeft(E left) {

    }

    @Override
    public void setRight(E right) {

    }
}
