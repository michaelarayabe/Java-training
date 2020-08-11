package playground.lambda_practise.horet;

public interface WordProcessor {
    String processor(String s);

    static String quote(String s){
        return String.format("<<%s>>", s);
    }
}
