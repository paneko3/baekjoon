// BOJ_1731_추론

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1731 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        /* ==========output========== */
        if(arr[2]-arr[1]==arr[1]-arr[0]&&arr[2]>1){
            System.out.println(arr[N-1]+arr[1]-arr[0]);
        }else {
            System.out.println(arr[N-1]*(arr[1]/arr[0]));
        }
        br.close();
    }
}