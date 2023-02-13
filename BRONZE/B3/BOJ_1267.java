// BOJ_1267_핸드폰 요금

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1267 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Y =0;
        int M =0;
        for(int i=0;i<N;i++){
            int temp = Integer.parseInt(st.nextToken());
            Y += 10 + temp/30 * 10;
            M += 15 + temp/60 * 15;
        }
        /* ==========output========== */
        if(Y<M){
            System.out.println("Y " + Y);
        }else if(Y>M){
            System.out.println("M " + M);
        }else {
            System.out.println("Y M " + Y);
        }
        br.close();
    }
}
