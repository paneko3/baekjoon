// BOJ_17390_이건 꼭 풀어야 해!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_17390 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Arrays.sort(arr);
        int[] sum = new int[N+1];
        for(int i=1;i<=N;i++){
            sum[i]=sum[i-1]+arr[i];
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<Q;i++){
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            sb.append(sum[R]-sum[L-1]).append("\n");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}