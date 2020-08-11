package playground.parlo;

@FunctionalInterface
public interface LamInterface {

    public abstract boolean isValid(String s);

    public static String quotes(String x){
        return String.format("<<%x>>", x);
    }
}
