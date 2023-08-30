// BOJ_14489_치킨 두 마리 (...)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14489 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(A+B>=(2*C)?(A+B)-(2*C):A+B);
        br.close();
    }
}