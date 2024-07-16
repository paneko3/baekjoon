// BOJ_14726_신용카드 판별

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            int[] num = new int[16];
            for(int i=0;i<16;i++){
                num[i]=str.charAt(i)-'0';
            }
            for(int i=0;i<16;i+=2){
                if(num[i]*2>=10){
                    num[i]=(num[i]*2)%10+1;
                }else {
                    num[i]=num[i]*2;
                }
            }
            int sum = 0;
            for(int i=0;i<16;i++){
                sum+=num[i];
            }
            /* ==========output========== */
            System.out.println(sum%10==0?"T":"F");
        }
        br.close();
    }
}