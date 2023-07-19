// BOJ_27433_팩토리얼 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_27433 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        long result = 1;
        for(int i=1;i<=N;i++){
            result*=i;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}