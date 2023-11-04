// BOJ_5361_전투 드로이드 가격

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5361 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        double[] cost = {350.34, 230.90, 190.55, 125.30, 180.90};
        for(int i=0;i<N;i++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            /* ==========sol========== */
            double result = 0;
            for(int j=0;j<5;j++){
                result+=Integer.parseInt(st.nextToken())*cost[j];
            }
            /* ==========output========== */
            System.out.printf("$%.2f\n",result);
        }
        br.close();
    }
}