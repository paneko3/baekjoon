// BOJ_2210_숫자판 점프

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_2210 {
    static int[][] map;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static HashSet<String> set;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        map = new int[5][5];
        for(int i=0;i<5;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        set = new HashSet<>();
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                dfs(i,j,0,"");
            }
        }
        /* ==========output========== */
        System.out.println(set.size());
        br.close();
    }
    static void dfs(int x, int y, int count, String str){
        if(count==6){
            set.add(str);
            return;
        }
        for(int dir=0;dir<4;dir++){
            int row = x +dx[dir];
            int col = y +dy[dir];
            if(row<0||row>=5||col<0||col>=5){
                continue;
            }
            dfs(row,col,count+1,str+map[row][col]);
        }
    }
}
