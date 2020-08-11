package playground.lambda_practise.particles;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence){
        this.sentence = sentence;
    }

    public void printWordProcesser(WordProcesser wp){

        for(String a : sentence.split(" ")){

            System.out.println(wp.processer(a));
        }
    }
}
