// BOJ_18110_solved.ac

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_18110 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        Arrays.sort(arr);
        int x = (int) Math.round(N*0.15);
        int result = 0;
        for (int i=x;i<N-x;i++){
            result+=arr[i];
        }
        result= (int) Math.round((double)result/(N-2*x));
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}