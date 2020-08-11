package playground.lambda_practise.ather;

import java.util.function.Predicate;

public class TextPrinter {


    private String sentence;

    public TextPrinter(String sentence){
        this.sentence = sentence;
    }

    public void printWordsFiltered(Predicate<String> ff){

        for(String x : sentence.split(" ")){
            if(ff.test(x)){
                System.out.println(x);
            }
        }
    }
}
