package playground.lambda_practise.anopy;

@FunctionalInterface
public interface WordFilter {

    boolean isValid(String s);
}
