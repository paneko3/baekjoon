// BOJ_1568_새

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1568 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result=0;
        int count = 1;
        while (N!=0){
            result++;
            if(N-count<0){
                count=1;
            }
            N-=count++;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}