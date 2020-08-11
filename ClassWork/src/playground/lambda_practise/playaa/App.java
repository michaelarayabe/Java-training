package playground.lambda_practise.playaa;

public class App {

    public static void main(String[] args) {

        TextPrinter tp = new TextPrinter("This words will be for testing");

        tp.printTexts(s -> String.format("<<%s>>", s));

        System.out.println("************************************");

        tp.printTexts(s -> TextUtil.quo(s));

        System.out.println("************************************");

        tp.printTexts(TextUtil::quo);
    }
}
