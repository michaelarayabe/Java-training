package playground.lambda_practise.metmet;

public class App {

    public static void main(String[] args) {

        TextPrinter tp = new TextPrinter("This another sentence to play with");

        //tp.printProcessedWords((s) -> String.format("<<%s>>", s));

        tp.printProcessedWords(TextUtil::quote);

        TextPadder padder = new TextPadder(20);
        tp.printProcessedWords(padder::pad);

    }
}
