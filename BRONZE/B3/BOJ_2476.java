// BOJ_2476_주사위 게임

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2476 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result =0;
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            if(A == B && B ==C){
                result=Math.max(result,10000+A*1000);
            }else if(A==B){
                result=Math.max(result,1000+100*A);
            }else if(B==C){
                result=Math.max(result,1000+100*B);
            }else if(A==C){
                result=Math.max(result,1000+100*C);
            }else {
                result=Math.max(result,Math.max(A,Math.max(B,C))*100);
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
