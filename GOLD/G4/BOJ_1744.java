// BOJ_1744_수 묶기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1744 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        int minus = 0;
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(br.readLine());
            if(num[i]<=0){
                minus++;
            }
        }
        /* ==========sol========== */
        Arrays.sort(num);
        int  result=0;
        int i=-1;
        while (++i<minus){
            if(i +1 < minus){
                result +=num[i]*num[++i];
            }else {
                result += num[i];
            }
        }
        i=N;
        while (--i>=minus){
            if(i -1 >= minus&&num[i-1]>1){
                result +=num[i]*num[--i];
            }else {
                result += num[i];
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
