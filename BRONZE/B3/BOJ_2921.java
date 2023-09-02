// BOJ_2921_도미노

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2921 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 0;
        for(int i=0;i<=N;i++){
            for(int j=i;j<=N;j++){
                result+=(i+j);
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}