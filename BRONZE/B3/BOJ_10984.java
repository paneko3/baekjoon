// BOJ_10984_내 학점을 구해줘

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int test_case=0;test_case<T;test_case++){
            /* ==========input========== */
            /* ==========sol========== */
            int N = Integer.parseInt(br.readLine());
            double result=0;
            int sum = 0;
            for(int i=0;i<N;i++){
                st = new StringTokenizer(br.readLine());
                int C = Integer.parseInt(st.nextToken());
                double G = Double.parseDouble(st.nextToken());
                sum+=C;
                result+=G*C;
            }
            /* ==========output========== */
            System.out.println(sum + " " + Math.round(result*10/sum)/10.0);
        }
        br.close();
    }
}