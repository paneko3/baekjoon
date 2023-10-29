// BOJ_19939_박 터뜨리기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_19939 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[] balls = new int[K];
        int base = (N-((K*(K+1))/2));
        if(base<0){
            System.out.println("-1");
            return;
        }
        for(int i=0;i<K;i++){
            balls[i]=base/K;
            N -= base/K;
        }
        /* ==========output========== */
        if(N==((K*(K+1))/2)){
            System.out.println(K-1);
        }else {
            System.out.println(K);
        }
        br.close();
    }
}