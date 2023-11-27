// BOJ_5347_LCM

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5347 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a<b){
                int temp = a;
                a = b;
                b = temp;
            }
            /* ==========sol========== */
            /* ==========output========== */
            System.out.println((long)a*b/GCD(a,b));
        }
        br.close();
    }
    static long GCD(int a, int b){
        if(b==0){
            return a;
        }else {
            return GCD(b,a%b);
        }
    }
}