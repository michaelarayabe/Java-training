package playground.lambda_practise.anonprak;

public interface TextUtil {
    public static String quote(String s){
        return String.format("<<%s>>", s);
    }
}
