package playground.parlo;

public class Lamtry {

    private String sentence;

    public Lamtry(String sentence){

        this.sentence = sentence;
    }

    public void printWithFilter(LamInterface li){
        for(String x : sentence.split(" ")){
            if(li.isValid(x)){
                System.out.println(x);
            }
        }
    }
}
