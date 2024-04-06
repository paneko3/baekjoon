// BOJ_3943_헤일스톤 수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            /* ==========input========== */
            int n = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            int result = n;
            while (n!=1){
                n = (n%2==0)?n/2:n*3+1;
                result=Math.max(result,n);
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}