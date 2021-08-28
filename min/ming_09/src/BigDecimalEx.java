import java.math.BigDecimal;
import java.math.MathContext;

import static java.math.RoundingMode.HALF_UP;

public class BigDecimalEx {
    public static void main(String[] args) {
        BigDecimal db1 = new BigDecimal("123.456");
        BigDecimal db2 = new BigDecimal("1.0");

        System.out.print("db1 = "+db1);
        System.out.print(", \tvalue = "+db1.unscaledValue());
        System.out.print(", \tscale = "+db1.scale());
        System.out.print(", \tprecision = "+db1.precision());
        System.out.println();

        System.out.print("db2 = "+db2);
        System.out.print(", \tvalue = "+db2.unscaledValue());
        System.out.print(", \tscale = "+db2.scale());
        System.out.print(", \tprecision = "+db2.precision());
        System.out.println();

        BigDecimal db3 =db1.multiply(db2);
        System.out.print("db3 = "+db3);
        System.out.print(", \tvalue = "+db3.unscaledValue());
        System.out.print(", \tscale = "+db3.scale());
        System.out.print(", \tprecision = "+db3.precision());
        System.out.println();

        System.out.println(db1.divide(db2,2,HALF_UP));
        System.out.println(db1.setScale(2,HALF_UP));
        System.out.println(db1.divide(db2,new MathContext(2,HALF_UP)));


    }
}
