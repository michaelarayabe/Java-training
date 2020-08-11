package playground.lambda_practise.horet;

public class App {

    public static void main(String[] args) {
        Som som = new Som("This is nother sentence we are");

        som.printWithCriteria(WordProcessor::quote);
    }
}
