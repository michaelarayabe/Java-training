package generics.example_on_interface;

public class ShoePair implements Pair<Shoe> {

    //here is a non generic class implementing generic interface

    private Shoe leftShoe;
    private Shoe rightShoe;

    public ShoePair(Shoe left, Shoe right){
        this.leftShoe = left;
        this.rightShoe = right;
    }

    @Override
    public Shoe getLeft() {
        return leftShoe;
    }


    @Override
    public Shoe getRight() {
        return rightShoe;
    }

    @Override
    public void setLeft(Shoe leftShoe) {
        this.leftShoe = leftShoe;
    }

    @Override
    public void setRight(Shoe rightShoe) {
        this.rightShoe = rightShoe;
    }
}
