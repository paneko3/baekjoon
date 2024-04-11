// BOJ_1531_투명

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1531 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[101][101];
        for(int k=0;k<N;k++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for(int i=x1;i<=x2;i++){
                for(int j=y1;j<=y2;j++){
                    map[i][j]++;
                }
            }
        }
        /* ==========sol========== */
        int result = 0;
        for(int i=1;i<=100;i++){
            for(int j=1;j<=100;j++){
                if(map[i][j]>M){
                    result++;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}