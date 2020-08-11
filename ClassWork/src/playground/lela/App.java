package playground.lela;

public class App {

    public static void main(String[] args) {

        TextPrinter tp = new TextPrinter("This is some exp");

        //tp.printProcessedWords(s ->String.format("<<%s>>",s));
        //tp.printProcessedWords(s ->TextUtil.quote(s));

        tp.printProcessedWords(TextUtil::quote);


        TextPadder padder = new TextPadder(1);
        tp.printProcessedWords(s ->padder.pad(s));

        TextPadder padder1 = new TextPadder(10);

        tp.printProcessedWords(new WordProcessor() {
            @Override
            public String process(String s) {
                return padder1.pad(s);
            }
        });



        tp.printProcessedWords(s ->s.toUpperCase());

        tp.printProcessedWords(new WordProcessor() {
            @Override
            public String process(String s) {
                return s.toLowerCase();
            }
        });
    }
}
