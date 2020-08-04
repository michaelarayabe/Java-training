package lambda.demo_1;

public class App {

    public static void main(String[] args) {

        GreetAble implObject = new GreetAble() {
            @Override
            public void greet() {
                System.out.println("This is quite cumbersome");
            }
        };

        implObject.greet();
        implObject.defaultAllowed();
        GreetAble.staticAllowed();

        implObject = new GreetAble() {
            @Override
            public void greet() {
                System.out.println("we made a new implementation");
            }
        };

        implObject.greet();

        GreetAble lobj = () -> {System.out.println("Js make me want to flip the table" +
                "screw 'this', but 'this' refers to"); };

        lobj.greet();
    }
}
