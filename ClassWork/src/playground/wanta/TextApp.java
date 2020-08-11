package playground.wanta;

import java.math.BigDecimal;

public class TextApp {

    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("123 21 22 11 1123 5");

        tp.printNumberValues(s ->new BigDecimal(s));
    }
}
