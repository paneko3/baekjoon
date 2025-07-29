// BOJ_12871_무한 문자열

import java.io.*;
import java.util.*;

public class BOJ_12871 {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        /* ==========sol========== */
        int sLen = s.length();
        int tLen = t.length();

        int commonDivisor = gcd(sLen, tLen);
        int lcm = (sLen * tLen) / commonDivisor;

        StringBuilder extendedS = new StringBuilder();
        for (int i = 0; i < lcm / sLen; i++) {
            extendedS.append(s);
        }

        StringBuilder extendedT = new StringBuilder();
        for (int i = 0; i < lcm / tLen; i++) {
            extendedT.append(t);
        }

        int result = extendedS.toString().equals(extendedT.toString()) ? 1 : 0;
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
