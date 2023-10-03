// BOJ_17086_아기 상어 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_17086 {
    static int N,M;
    static int[][] map;
    static int[] dx = {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};
    static class Node{
        int x,y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        int result = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(map[i][j]==0){
                    result=Math.max(result,bfs(i,j));
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static int bfs(int x,int y){
        Queue<Node> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];
        queue.add(new Node(x,y));
        visited[x][y]=true;
        int count = 0;
        while (true){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node node = queue.poll();
                if(map[node.x][node.y]==1){
                    return count;
                }
                for(int dir=0;dir<8;dir++){
                    int r = node.x + dx[dir];
                    int c = node.y + dy[dir];
                    if(r<0||r>=N||c<0||c>=M||visited[r][c]){
                        continue;
                    }
                    visited[r][c]=true;
                    queue.add(new Node(r,c));
                }
            }
            count++;
        }
    }
}