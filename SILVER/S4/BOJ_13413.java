// BOJ_13413_오셀로 재배치

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_13413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            /* ==========input========== */
            int N = Integer.parseInt(br.readLine());
            String start = br.readLine();
            String goal = br.readLine();
            /* ==========sol========== */
            int b = 0;
            int w = 0;
            for(int i=0;i<N;i++){
                if(start.charAt(i)!=goal.charAt(i)){
                    if(start.charAt(i)=='B'){
                        b++;
                    }else {
                        w++;
                    }
                }
            }
            /* ==========output========== */
            System.out.println(Math.max(b,w));
        }
        br.close();
    }
}