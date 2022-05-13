// BOJ_21610_마법사 상어와 비바라기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_21610 {
    static int N, M, result;
    static int[][] map, moves;
    static boolean[][] rained;
    static int[] dx = {0, 0, -1, -1, -1, 0, 1, 1, 1};
    static int[] dy = {0, -1, -1, 0, 1, 1, 1, 0, -1};
    static class Node{
        int x,y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static ArrayList<Node> cloud;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N + 1][N + 1];
        moves = new int[M][2];
        cloud = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        cloud.add(new Node(N,1));
        cloud.add(new Node(N,2));
        cloud.add(new Node(N-1,1));
        cloud.add(new Node(N-1,2));
        for (int i = 0; i < M; i++) {
            rained = new boolean[N + 1][N + 1];
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            move(d,s);
            rain();
            createCloud();
        }
        /* ==========output========== */
        result=0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                result+=map[i][j];
            }
        }
        System.out.println(result);
        br.close();
    }
    /* ==========move========== */
    static void move(int d, int s){
        for(int i=0;i<cloud.size();i++){
            int row =cloud.get(i).x + dx[d]*s;
            int col = cloud.get(i).y + dy[d]*s;
            row = (row-1)%N+1;
            col = (col-1)%N+1;
            if(row<=0){
                row=N+row;
            }
            if(col<=0){
                col=N+col;
            }
            cloud.get(i).x = row;
            cloud.get(i).y = col;
            rained[row][col]=true;
        }
    }
    /* ==========rain========== */
    static void rain(){
        for(int i=0;i<cloud.size();i++) {
            int x = cloud.get(i).x;
            int y = cloud.get(i).y;
            map[x][y]++;
        }
        for(int i=0;i<cloud.size();i++) {
            int x = cloud.get(i).x;
            int y = cloud.get(i).y;
            for(int j=1;j<=4;j++){
                int row = x+dx[2*j];
                int col = y+dy[2*j];
                if(row<=0||row>N||col<=0||col>N||map[row][col]==0) continue;
                map[x][y]++;
            }
        }
    }
    /* ==========createCloud========== */
    static void createCloud(){
        cloud = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if(map[i][j]>=2&&!rained[i][j]){
                    cloud.add(new Node(i,j));
                    map[i][j]--;
                    map[i][j]--;
                }
            }
        }
    }
}
