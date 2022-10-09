// BOJ_1271_엄청난 부자2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_1271 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger n =new BigInteger(st.nextToken());
        BigInteger m =new BigInteger(st.nextToken());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(n.divide(m));
        System.out.println(String.valueOf(n.remainder(m)));
        br.close();
    }
}
