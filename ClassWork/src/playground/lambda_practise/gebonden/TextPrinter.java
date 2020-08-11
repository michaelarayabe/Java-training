package playground.lambda_practise.gebonden;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence){
        this.sentence = sentence;
    }

    public void printTexts(WordProcessing one){
        for(String x : sentence.split(" ")){
            System.out.println(one.quotes(x));
        }
    }
}
