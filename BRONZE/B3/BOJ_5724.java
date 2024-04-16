// BOJ_5724_파인만

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5724 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[101];
        for(int i=1;i<=100;i++){
            arr[i]=i*i+arr[i-1];
        }
        /* ==========sol========== */
        /* ==========output========== */
        while (true){
            int n = Integer.parseInt(br.readLine());
            if(n==0){
                break;
            }
            System.out.println(arr[n]);
        }
        br.close();
    }
}