// BOJ_2061_좋은 암호

import java.util.Scanner;
import java.math.BigInteger;

public class BOJ_2061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        BigInteger k = new BigInteger(sc.next());
        int l = sc.nextInt();

        /* ==========sol========== */
        int r = 0;
        for (int i = 2; i < l; i++) {
            if (k.remainder(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                r = i;
                break;
            }
        }

        /* ==========output========== */
        if (r == 0) {
            System.out.println("GOOD");
        } else {
            System.out.println("BAD " + r);
        }
        sc.close();
    }
}
