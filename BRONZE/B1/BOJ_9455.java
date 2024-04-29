// BOJ_9455_박스

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9455 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int t=0;t<T;t++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int[][] map = new int[m][n];
            for(int i=0;i<m;i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<n;j++){
                    map[i][j]=Integer.parseInt(st.nextToken());
                }
            }
            /* ==========sol========== */
            int result = 0;
            for(int i=0;i<n;i++){
                int count = 0;
                for(int j=m-1;j>=0;j--){
                    if(map[j][i]==0){
                        count++;
                    }else {
                        result+=count;
                    }
                }
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}