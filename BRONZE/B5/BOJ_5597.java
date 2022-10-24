// BOJ_5597_과제 안 내신 분..?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5597 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[31];
        for(int i=0;i<28;i++){
            num[Integer.parseInt(br.readLine())]++;
        }
        /* ==========output========== */
        for(int i=1;i<=30;i++){
            if(num[i]==0){
                System.out.println(i);
            }
        }
        br.close();
    }
}
