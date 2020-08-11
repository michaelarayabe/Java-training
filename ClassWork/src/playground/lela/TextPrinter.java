package playground.lela;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence){

        this.sentence = sentence;
    }

    public void printProcessedWords(WordProcessor processor){
        for(String w : sentence.split(" ")){
            System.out.println(processor.process(w));
        }
    }


}
