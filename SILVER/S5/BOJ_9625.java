// BOJ_9625_BABBA

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9625 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[] fibo = new int[N+1];
        fibo[1]=1;
        for(int i=2;i<=N;i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        /* ==========output========== */
        System.out.println(fibo[N-1] + " " + fibo[N]);
        br.close();
    }
}