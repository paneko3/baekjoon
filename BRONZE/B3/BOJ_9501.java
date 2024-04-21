// BOJ_9501_꿍의 우주여행

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int t=0;t<T;t++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            double D = Double.parseDouble(st.nextToken());
            /* ==========sol========== */
            int result = 0;
            for(int i=0;i<N;i++){
                st = new StringTokenizer(br.readLine());
                double v = Double.parseDouble(st.nextToken());
                double f = Double.parseDouble(st.nextToken());
                double c = Double.parseDouble(st.nextToken());
                if((D/v)*c<=f){
                    result++;
                }
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}