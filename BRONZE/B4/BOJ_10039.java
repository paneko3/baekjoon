// BOJ_10039_평균 점수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10039 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        for(int i=0;i<5;i++){
            int temp =Integer.parseInt(br.readLine());
            sum+=temp<40?40:temp;
        }
        /* ==========output========== */
            System.out.println(sum/5);


        br.close();
    }
}
