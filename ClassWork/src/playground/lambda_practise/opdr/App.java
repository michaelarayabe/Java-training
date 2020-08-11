package playground.lambda_practise.opdr;

public class App {

    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("aelo");

        TextScrambler ts = new TextScrambler();

        //tp.printProcessedWords(Textutil::reverse);
        tp.printProcessedWords(ts::scramble);
    }
}
