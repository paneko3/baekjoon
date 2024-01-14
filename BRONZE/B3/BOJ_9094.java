// BOJ_9094_수학적 호기심

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int t=0;t<T;t++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            int result = 0;
            for(int a=1;a<n-1;a++){
                for(int b=a+1;b<n;b++){
                    if((a*a+b*b+m)%(a*b)==0){
                        result++;
                    }
                }
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}