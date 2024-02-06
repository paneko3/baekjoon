// BOJ_13900_순서쌍의 곱의 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13900 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] arr = new long[N];
        long sum = 0;
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            sum+=arr[i];
        }
        /* ==========sol========== */
        long result = 0;
        for(int i=0;i<N;i++){
            result+=arr[i]*(sum-arr[i]);
            sum-=arr[i];
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}