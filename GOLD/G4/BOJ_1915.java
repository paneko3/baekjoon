// BOJ_1915_가장 큰 정사각형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1915 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n+1][m+1];
        int[][] sum = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            String str = br.readLine();
            for(int j=1;j<=m;j++){
                map[i][j]=str.charAt(j-1)-'0';
                sum[i][j]=map[i][j]+sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1];
            }
        }
        /* ==========sol========== */
        int result=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(map[i][j]==1){
                    int temp = 1;
                    int idx = 1;
                    while(i+idx<=n&&j+idx<=m){
                        int space = sum[i+idx][j+idx]-sum[i+idx][j-1]-sum[i-1][j+idx]+sum[i-1][j-1];
                        idx++;
                        if(space!=idx*idx){
                            break;
                        }
                        temp =idx * idx;
                    }
                    result = Math.max(result, temp);
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
