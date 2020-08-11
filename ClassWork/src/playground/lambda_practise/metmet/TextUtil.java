package playground.lambda_practise.metmet;

public interface TextUtil {
    public static String quote(String s){
        return String.format("<<%s>>", s);
    }
}
