// BOJ_10163_색종이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10163 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] map = new int[1002][1002];
        for(int k=1;k<=N;k++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            for(int i=a;i<a+c;i++){
                for(int j=b;j<b+d;j++){
                    map[i][j]=k;
                }
            }
        }
        /* ==========sol========== */
        /* ==========output========== */
        for(int k=1;k<=N;k++){
            int result = 0;
            for(int i=0;i<1002;i++){
                for(int j=0;j<1002;j++){
                    if(map[i][j]==k){
                        result++;
                    }
                }
            }
            System.out.println(result);
        }
        br.close();
    }
}