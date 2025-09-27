// BOJ_15721_번데기

import java.io.*;
import java.util.*;

public class BOJ_15721 {
    static int A, T, N;
    static int repeat = 2;
    static int zeroCount, oneCount;

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(br.readLine());
        T = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        int result = solve();

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }

    public static int solve() {
        while (true) {
            for (int i = 0; i < 4; i++) {
                if (i % 2 == 0) {
                    zeroCount++;
                } else {
                    oneCount++;
                }
                
                if (N == 0 && zeroCount == T) {
                    return (zeroCount + oneCount - 1) % A;
                }
                
                if (N == 1 && oneCount == T) {
                    return (zeroCount + oneCount - 1) % A;
                }
            }
            
            for (int i = 0; i < repeat; i++) {
                zeroCount++;
                if (zeroCount == T && N == 0) {
                    return (zeroCount + oneCount - 1) % A;
                }
            }
            
            for (int i = 0; i < repeat; i++) {
                oneCount++;
                if (oneCount == T && N == 1) {
                    return (zeroCount + oneCount - 1) % A;
                }
            }
            
            repeat++;
        }
    }
}
