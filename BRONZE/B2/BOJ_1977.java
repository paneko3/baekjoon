// BOJ_1977_완전제곱수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1977 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M=Integer.parseInt(br.readLine());
        int N=Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result1=0;
        int result2=0;
        for(int i=(int)Math.sqrt(M);i<=Math.sqrt(N);i++){
            if(i*i<M) continue;
            if(result2==0){
                result2=i*i;
            }
            result1+=i*i;
        }
        /* ==========output========== */
        if(result2==0){
            System.out.println(-1);
        }else {
            System.out.println(result1);
            System.out.println(result2);
        }
        br.close();
    }
}
