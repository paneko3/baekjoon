// BOJ_1817_짐 챙기는 숌

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1817 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        if(N==0){
            System.out.println(0);
            return;
        }
        int result = 1;
        int now = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(st.nextToken());
            if(num>M){
                continue;
            }
            if(now+num<=M){
                now+=num;
            }else {
                result++;
                now = num;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}