// BOJ_2702_초6 수학

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2702 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            int result = GCD(a,b);
            /* ==========output========== */
            System.out.println(a*b/result + " " + result);
        }
        br.close();
    }
    static int GCD(int a, int b){
        if(a%b==0){
            return b;
        }else {
            return GCD(b,a%b);
        }
    }
}