package playground.lambda_practise.lam_3;

public class TextApps {

    public static void main(String[] args) {

        String x = "t";
        TextFormatter tf = new TextFormatter("this is what we are going to test on");

        tf.printingFilteredText(s -> s.contains(x));



    }
}
