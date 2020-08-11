package playground.lambda_practise.caboom;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence){
        this.sentence = sentence;
    }

    public void printNumberValue(NumberParser parser){

        for(String w : sentence.split(" ")){
            System.out.format("%, f%n", parser.parse(w));
        }
    }
}
