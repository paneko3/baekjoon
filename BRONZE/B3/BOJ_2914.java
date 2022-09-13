// BOJ_2914_저작권

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2914 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int I = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result =0;
        while (result / A != I - 1) {
            result++;
        }
        /* ==========output========== */
        System.out.println(result+1);
        br.close();
    }
}
