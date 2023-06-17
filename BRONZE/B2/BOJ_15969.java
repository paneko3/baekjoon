// BOJ_15969_행복

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15969 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int max = 0;
        int min = 1000;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int temp = Integer.parseInt(st.nextToken());
            max = Math.max(max,temp);
            min = Math.min(min,temp);
        }
        /* ==========output========== */
        System.out.println(max-min);
        br.close();
    }
}