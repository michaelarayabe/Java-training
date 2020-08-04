package lambda.demo_5;

import java.util.Random;

@FunctionalInterface
interface ParseAble{

    Integer parse(Character c);
}

public class Scrambler {

    private final String original;
    private final Integer[] scrambled;
    private final int KEY;

    public Scrambler(String original, int key) {

        if(original.isEmpty()) throw new RuntimeException("Not a valid String to scramble");
        if(key < 0) throw new RuntimeException("Not a valid key!");

        this.original = original;
        this.KEY = key;
        this.scrambled = new Integer[original.length()];
    }

    public void parse(ParseAble parser){
        for(int i = 0; i < original.length(); i++){
            scrambled[i] = parser.parse(original.charAt(i)) + new Random().nextInt(KEY);
        }
    }

    public Integer[] getScrambled(){ return scrambled;}
}
