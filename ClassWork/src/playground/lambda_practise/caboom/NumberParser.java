package playground.lambda_practise.caboom;

import java.math.BigDecimal;

@FunctionalInterface
public interface NumberParser {

    public BigDecimal parse(String s);
}
