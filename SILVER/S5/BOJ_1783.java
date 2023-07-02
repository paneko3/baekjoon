// BOJ_1783_병든 나이트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1783 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result = 0;
        if(N==1){
            result=1;
        }else if(N==2){
            result=Math.min(4,(M+1)/2);
        }else {
            if (M < 7) {
                result=Math.min(4,M);
            }else {
                result=M-2;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}