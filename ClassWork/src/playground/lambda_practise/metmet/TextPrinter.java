package playground.lambda_practise.metmet;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence){
        this.sentence = sentence;
    }

    public void printProcessedWords(WordProcessor processor){

        for(String d : sentence.split(" ")){
            System.out.println(processor.process(d));
        }

    }
}
