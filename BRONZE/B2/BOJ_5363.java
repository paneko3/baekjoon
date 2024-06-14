// BOJ_5363_요다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5363 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int t=0;t<N;t++){
            /* ==========input========== */
            String[] arr = br.readLine().split(" ");
            /* ==========sol========== */
            for(int i=2;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            /* ==========output========== */
            System.out.println(arr[0]+" "+arr[1]);
        }
        br.close();
    }
}