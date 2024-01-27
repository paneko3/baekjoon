// BOJ_20053_최소, 최대 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_20053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            /* ==========input========== */
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            /* ==========sol========== */
            int min = 1000000;
            int max = -1000000;
            for(int j=0;j<N;j++){
                int num = Integer.parseInt(st.nextToken());
                min = Math.min(min,num);
                max = Math.max(max,num);
            }
            /* ==========output========== */
            System.out.println(min+" "+max);
        }
        br.close();
    }
}