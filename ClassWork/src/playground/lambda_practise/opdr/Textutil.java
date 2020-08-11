package playground.lambda_practise.opdr;

public interface Textutil {

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }
}
