// BOJ_2669_직사각형 네개의 합집합의 면적 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2669 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean[][] map = new boolean[101][101];
        for(int k=0;k<4;k++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for(int i=x1;i<x2;i++){
                for(int j=y1;j<y2;j++){
                    map[i][j]=true;
                }
            }
        }
        /* ==========sol========== */
        int result=0;
        for(int i=0;i<101;i++){
            for(int j=0;j<101;j++){
                if(map[i][j]){
                    result++;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
