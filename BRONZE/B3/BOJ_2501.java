// BOJ_2501_약수 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2501 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result =0;
        for(int i=1;i<=N;i++){
            if(N%i==0){
                K--;
                if(K==0){
                    result=i;
                    break;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
