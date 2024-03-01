// BOJ_14495_피보나치 비스무리한 수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14495 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        long[] arr = new long[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=(i<=3)?1:arr[i-1]+arr[i-3];
        }
        /* ==========output========== */
        System.out.println(arr[n]);
        br.close();
    }
}