// BOJ_2576_홀수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2576 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min =100;
        int sum=0;
        for(int i=0;i<7;i++){
            int temp =Integer.parseInt(br.readLine());
            if(temp%2==0) continue;
            min=Math.min(min,temp);
            sum+=temp;
        }
        /* ==========output========== */
        if(sum==0){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }
        br.close();
    }
}
