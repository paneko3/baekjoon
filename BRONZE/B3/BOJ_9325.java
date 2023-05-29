// BOJ_9325_얼마?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9325 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int t=0;t<T;t++){
            /* ==========input========== */
            int s = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            for(int i=0;i<n;i++){
                st = new StringTokenizer(br.readLine());
                int q = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());
                s += q*p;
            }
            /* ==========sol========== */
            /* ==========output========== */
            System.out.println(s);
        }
        br.close();
    }
}