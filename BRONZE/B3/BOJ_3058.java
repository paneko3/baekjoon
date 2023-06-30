// BOJ_3058_짝수를 찾아라

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int i=0;i<T;i++){
            /* ==========input========== */
            /* ==========sol========== */
            int sum = 0;
            int min = 100;
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<7;j++){
                int num = Integer.parseInt(st.nextToken());
                if(num%2==0){
                    sum+=num;
                    min=Math.min(min,num);
                }
            }
            /* ==========output========== */
            System.out.println(sum + " " + min);
        }
        br.close();
    }
}