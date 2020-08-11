package playground.lambda_practise.gebonden;

public class App {

    public static void main(String[] args) {

        TextPrinter tp = new TextPrinter("This is some expermental sentence written");

        tp.printTexts(s -> String.format("<<%s>>", s));

        TextPadder padder = new TextPadder(20);

        tp.printTexts(padder::pad);

        tp.printTexts(String::toLowerCase);

        tp.printTexts(String::toUpperCase);

    }
}
