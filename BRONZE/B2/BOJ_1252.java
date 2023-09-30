// BOJ_1252_이진수 덧셈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_1252 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(st.nextToken(),2);
        BigInteger b = new BigInteger(st.nextToken(),2);
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(a.add(b).toString(2));
        br.close();
    }
}