// BOJ_26068_치킨댄스를 추는 곰곰이를 본 임스 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_26068 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 0;
        for(int i=0;i<N;i++){
            int day = Integer.parseInt(br.readLine().substring(2));
            if(day<=90){
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}