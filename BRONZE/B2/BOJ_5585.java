// BOJ_5585_거스름돈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5585 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        /* ==========sol========== */
        N=1000-N;
        int[] num ={500,100,50,10,5,1};
        int result=0;
        for(int i=0;i<6;i++){
            if(N>=num[i]){
                result+=N/num[i];
                N%=num[i];
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
