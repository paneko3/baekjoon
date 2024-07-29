// BOJ_11637_인기 투표

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11637 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            int N = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            int max = 0;
            int idx = 0;
            int sum = 0;
            boolean flag = false;
            for(int i=1;i<=N;i++){
                int num = Integer.parseInt(br.readLine());
                sum+=num;
                if(num>=max){
                    if(num==max){
                        flag=true;
                    }else {
                        flag=false;
                    }
                    max=num;
                    idx=i;
                }
            }
            /* ==========output========== */
            if(flag){
                System.out.println("no winner");
            }else if(max>(sum/2)){
                System.out.println("majority winner " + idx);
            }else {
                System.out.println("minority winner " + idx);
            }
        }
        br.close();
    }
}