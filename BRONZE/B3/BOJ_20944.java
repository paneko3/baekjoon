// BOJ_20944_팰린드롬 척화비

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_20944 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append("a");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}