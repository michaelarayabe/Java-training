package playground.lambda_practise.lambda_2;

public class TextFilter {

    private String sentence;

    public TextFilter(String sentence){
        this.sentence = sentence;
    }

    public void printFilteredTexts(WordFilterer filterer){

        for(String x : sentence.split(" ")){
            if(filterer.isValid(x)){
                System.out.println(x);
            }
        }

    }
}
