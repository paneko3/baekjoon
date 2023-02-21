// BOJ_3460_이진수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            int n=Integer.parseInt(br.readLine());
            int i=0;
            /* ==========sol========== */
            /* ==========output========== */
            while (n>0){
                if(n%2==1){
                    System.out.print(i + " ");
                }
                i++;
                n/=2;
            }
            System.out.println();
        }
        br.close();
    }
}
