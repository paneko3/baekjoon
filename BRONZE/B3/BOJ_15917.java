// BOJ_15917_노솔브 방지문제야!!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15917 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Q = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Loop:for(int i=0;i<Q;i++){
            /* ==========input========== */
            int a = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            if(a==1){
                sb.append(1).append("\n");
                continue Loop;
            }else {
                while (a!=2){
                    if(a%2==0){
                        a/=2;
                    }else {
                        sb.append(0).append("\n");
                        continue Loop;
                    }
                }
            }
            sb.append(1).append("\n");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}