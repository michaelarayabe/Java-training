package playground.lambda_practise.lam_3;

public class TextFormatter {

    private String sentence;

    public TextFormatter(String sentence){
        this.sentence = sentence;
    }

    public void printingFilteredText(WordFil fil){

        for(String x : sentence.split(" ")){
            if(fil.isValid(x)){
                System.out.println(x);
            }
        }
    }
}
