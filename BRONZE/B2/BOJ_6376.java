// BOJ_6376_e 계산

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BOJ_6376 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        
        /* ==========sol========== */
        BigDecimal e = BigDecimal.ZERO;
        BigDecimal factorial = BigDecimal.ONE;
        BigDecimal[] eValues = new BigDecimal[10];

        for (int i = 0; i <= 9; i++) {
            if (i > 0) {
                factorial = factorial.multiply(BigDecimal.valueOf(i));
            }
            e = e.add(BigDecimal.ONE.divide(factorial, 10, RoundingMode.HALF_UP));
            eValues[i] = e;
        }
        
        /* ==========output========== */
        System.out.println("n e");
        System.out.println("- -----------");
        
        System.out.println("0 1");
        System.out.println("1 2");
        System.out.println("2 2.5");
        
        for (int i = 3; i <= 9; i++) {
            System.out.printf("%d %.9f\n", i, eValues[i]);
        }
    }
}
