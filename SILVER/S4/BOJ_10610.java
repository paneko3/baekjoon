// BOJ_2475_검증수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10610 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N=br.readLine();
        /* ==========sol========== */
        int[] num = new int[10];
        long sum=0;
        for(int i=0;i<N.length();i++){
            int temp = N.charAt(i)-'0';
            num[temp]++;
            sum+=temp;
        }
        /* ==========output========== */
        if(num[0]==0||sum%3!=0){
            System.out.println(-1);
        }else {
            StringBuilder sb = new StringBuilder();
            for(int i=9;i>=0;i--){
                while (num[i]>0){
                    sb.append(i);
                    num[i]--;
                }
            }
            System.out.println(sb);
        }
        br.close();
    }
}
