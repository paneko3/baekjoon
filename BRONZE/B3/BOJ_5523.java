// BOJ_5523_경기 결과

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5523 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int result1 = 0;
        int result2 = 0;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A>B){
                result1++;
            }else if(A<B){
                result2++;
            }
        }
        /* ==========output========== */
        System.out.println(result1 + " " + result2);
        br.close();
    }
}