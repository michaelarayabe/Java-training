package playground.lambda_practise.anopy;

public class TextApp {

    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("This is a sentence we shall experenmt on");
        //tp.printFilteredWords((s) -> s.contains("i"));

        tp.printFilteredWords(String::isEmpty);


    }
}
