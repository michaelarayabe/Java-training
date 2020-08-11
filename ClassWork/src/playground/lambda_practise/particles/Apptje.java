package playground.lambda_practise.particles;

public class Apptje {

    public static void main(String[] args) {

        TextPrinter tp = new TextPrinter("This one is different from another or previous one ishe");

        tp.printWordProcesser(s -> String.format("<<%s>>", s));

        System.out.println("***********************");

        tp.printWordProcesser(SomeUtil::quote);
    }
}
