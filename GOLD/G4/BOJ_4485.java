// BOJ_4485_녹색 옷 입은 애가 젤다지?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_4485 {
    static class Node implements Comparable<Node> {
        int x,y,cost;
        public Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
        @Override
        public int compareTo(Node o) {
            return this.cost-o.cost;
        }
    }
    static int INF = (int)1e9;
    static int N,test_case;
    static int[][] map,distance;
    static int[] dx={0,1,0,-1};
    static int[] dy={1,0,-1,0};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        test_case=1;
        while (true){
            N = Integer.parseInt(br.readLine());
            if(N==0) break;
            map=new int[N+1][N+1];
            distance=new int[N+1][N+1];
            for(int i=1;i<=N;i++){
                Arrays.fill(distance[i],INF);
            }
            for(int i=1;i<=N;i++){
                st=new StringTokenizer(br.readLine());
                for(int j=1;j<=N;j++){
                    map[i][j]=Integer.parseInt(st.nextToken());
                }
            }
            dijkstra();
            test_case++;
        }
        /* ==========sol========== */
        /* ==========output========== */
        br.close();
    }
    static void dijkstra(){
        distance[1][1]=map[1][1];
        PriorityQueue<Node> queue=new PriorityQueue<>();
        queue.add(new Node(1,1,map[1][1]));
        while (!queue.isEmpty()){
            Node now = queue.poll();
            for(int dir=0;dir<4;dir++){
                int row = now.x+dx[dir];
                int col = now.y+dy[dir];
                if(row<1||row>N||col<1||col>N) continue;
                if(distance[row][col]>distance[now.x][now.y]+map[row][col]){
                    distance[row][col]=distance[now.x][now.y]+map[row][col];
                    queue.add(new Node(row,col,distance[row][col]));
                }
            }
        }
        System.out.println("Problem " + test_case+ ": "+  distance[N][N]);
    }
}