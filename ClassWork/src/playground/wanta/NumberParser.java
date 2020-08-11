package playground.wanta;

import java.math.BigDecimal;

@FunctionalInterface
public interface NumberParser {

    public BigDecimal parse(String s);
}
