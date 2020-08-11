package playground.lambda_practise.horet;

public class Som {

    private String sentence;

    public Som(String sentence){

        this.sentence = sentence;
    }

    public void printWithCriteria(WordProcessor wordProcessor){

        for(String x : sentence.split(" ")){


            System.out.println(wordProcessor.processor(x));
        }
    }
}
