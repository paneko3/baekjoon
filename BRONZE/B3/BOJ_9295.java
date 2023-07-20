// BOJ_9295_주사위

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9295 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        for(int i=1;i<=N;i++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            /* ==========sol========== */
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            /* ==========output========== */
            System.out.println("Case " + i +": " + (a+b));
        }
        br.close();
    }
}