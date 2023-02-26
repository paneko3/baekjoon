// BOJ_13300_방 배정

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_13300 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] num = new int[2][7];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            num[S][Y]++;
        }
        /* ==========sol========== */
        int result=0;
        for(int i=0;i<2;i++){
            for(int j=1;j<=6;j++){
                result+=num[i][j]%K==0?num[i][j]/K:num[i][j]/K+1;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
