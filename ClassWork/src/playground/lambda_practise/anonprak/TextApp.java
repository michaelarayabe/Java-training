package playground.lambda_practise.anonprak;

public class TextApp {

    public static void main(String[] args) {

        TextPrinter tp = new TextPrinter("This is another sentence we are going to work with");
        tp.printProcessedWords(s -> String.format("<<%s>>", s));

        tp.printProcessedWords(s -> TextUtil.quote(s));

        tp.printProcessedWords(TextUtil::quote);
    }
}
