// BOJ_2851_슈퍼 마리오

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2851 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[11];
        for(int i=1;i<=10;i++){
            num[i]=num[i-1]+Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        int result=0;
        int temp=100;
        for(int i=1;i<=10;i++){
            if(temp>=Math.abs(100-num[i])){
                temp =Math.abs(100-num[i]);
                result=num[i];
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
