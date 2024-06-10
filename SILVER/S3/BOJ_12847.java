// BOJ_12847_꿀 아르바이트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_12847 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] sum = new long[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            sum[i]=sum[i-1]+Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        long result = 0;
        for(int i=m;i<=n;i++){
            result=Math.max(result,sum[i]-sum[i-m]);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}