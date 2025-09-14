// BOJ_2729_이진수 덧셈

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class BOJ_2729 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        /* ==========sol========== */
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger b1 = new BigInteger(st.nextToken(), 2);
            BigInteger b2 = new BigInteger(st.nextToken(), 2);
            BigInteger sum = b1.add(b2);

            String binarySum = sum.toString(2);

            // 불필요한 0 제거
            if (binarySum.equals("0")) {
                result.append("0\n");
            } else {
                int firstOne = binarySum.indexOf('1');
                if (firstOne != -1) {
                    result.append(binarySum.substring(firstOne)).append("\n");
                } else {
                    result.append("0\n");
                }
            }
        }
        
        /* ==========output========== */
        System.out.print(result);
        br.close();
    }
}
