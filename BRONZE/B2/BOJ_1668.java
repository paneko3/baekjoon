// BOJ_1668_트로피 진열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1668 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        int result1 = 0;
        int result2 = 0;
        int h1 = 0;
        int h2 = 0;
        for(int i=0;i<N;i++){
            if(arr[i]>h1){
                result1++;
                h1=arr[i];
            }
            if(arr[N-1-i]>h2){
                result2++;
                h2=arr[N-1-i];
            }
        }
        /* ==========output========== */
        System.out.println(result1);
        System.out.println(result2);
        br.close();
    }
}