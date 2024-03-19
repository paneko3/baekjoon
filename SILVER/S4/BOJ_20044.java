// BOJ_20044_Project Teams

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_20044 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N*2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N*2;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Arrays.sort(arr);
        int result = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            result=Math.min(result,arr[i]+arr[N*2-1-i]);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}