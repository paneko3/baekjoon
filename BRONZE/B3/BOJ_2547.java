// BOJ_2547_사탕 선생 고창영
import java.io.*;
import java.math.BigInteger;

public class BOJ_2547 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            br.readLine(); // 빈 줄 제거
            int N = Integer.parseInt(br.readLine());
            BigInteger sum = BigInteger.ZERO;
            for (int i = 0; i < N; i++) {
                sum = sum.add(new BigInteger(br.readLine()));
            }

            /* ==========sol+output========== */
            System.out.println(sum.mod(BigInteger.valueOf(N)).equals(BigInteger.ZERO) ? "YES" : "NO");
        }
    }
}
