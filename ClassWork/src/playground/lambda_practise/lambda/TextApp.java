package playground.lambda_practise.lambda;

public class TextApp {

    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("Hello this is an example of a sentence containing words");

        System.out.println("*** Words containing 'e' ***");

        tp.printFilteredWords(new WordFilter() {

            @Override
            public boolean isValid(String s) {
                return s.contains("e");
            }
        });

        System.out.println("*** Long words ***");

        tp.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid(String s) {
                return s.length() > 4;
            }
        });

        tp.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid(String s) {
                return s.startsWith("a");
            }
        });
    }
}
