// BOJ_8741_이진수 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8741 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(1);
        }
        for(int i=0;i<N-1;i++){
            sb.append(0);
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}