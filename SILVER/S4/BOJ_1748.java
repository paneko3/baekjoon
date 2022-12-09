// BOJ_1748_수 이어 쓰기 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1748 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        int len=str.length();
        int N=Integer.parseInt(str);
        double temp = Math.pow(10,len-1);
        int result = (int) ((N-temp+1)*len);
        for(int i=1;i<len;i++){
            result+=i*9*Math.pow(10,i-1);
        }
        /* ==========output========== */
        if(N<10){
            System.out.println(N);
        }else {
            System.out.println(result);
        }
        br.close();
    }
}
