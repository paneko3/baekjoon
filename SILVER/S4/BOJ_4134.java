// BOJ_4134_다음 소수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            /* ==========input========== */
            long n = Long.parseLong(br.readLine());
            if(n==0||n==1||n==2){
                System.out.println(2);
                continue;
            }
            /* ==========sol========== */
            /* ==========output========== */
            while (true){
                int result = 0;
                for(long j=2;j<=Math.sqrt(n);j++){
                    if(n%j==0){
                        result++;
                        break;
                    }
                }
                if(result==0){
                    System.out.println(n);
                    break;
                }
                n++;
            }
        }
        br.close();
    }
}