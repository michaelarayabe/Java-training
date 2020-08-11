package playground.lambda_practise.caboom;

import java.math.BigDecimal;

public class TextApp {

    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("122 236 2222 111 192");
        tp.printNumberValue(BigDecimal::new);
    }
}
