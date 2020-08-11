package playground.lambda_practise.opdr;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence){
        this.sentence = sentence;
    }

    public void printProcessedWords(WordProcessor processor){

        for(String x : sentence.split(" ")){
            System.out.println(processor.process(x));
        }
    }
}
