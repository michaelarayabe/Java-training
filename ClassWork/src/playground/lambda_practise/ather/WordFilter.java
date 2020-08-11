package playground.lambda_practise.ather;

@FunctionalInterface
public interface WordFilter {

    boolean isValid(String s);
}
