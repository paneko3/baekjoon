// BOJ_2146_다리 만들기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2146 {
    static int N, result;
    static int[][] map, detail;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
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
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        detail = new int[N][N];
        result=Integer.MAX_VALUE;
        makeDetail();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(map[i][j]==1){
                    Loop: for(int d=0;d<4;d++){
                        int row = i + dx[d];
                        int col = j + dy[d];
                        if(row<0||row>=N||col<0||col>=N||map[row][col]==1) continue;
                        boolean[][] visited = new boolean[N][N];
                        visited[row][col]=true;
                        Queue<Node> queue = new LinkedList<>();
                        queue.add(new Node(row,col));
                        int count=1;
                        while (!queue.isEmpty()){
                            int size = queue.size();
                            for(int s=0;s<size;s++){
                                Node now = queue.poll();
                                for(int dir=0;dir<4;dir++){
                                    int nr = now.x + dx[dir];
                                    int nc = now.y + dy[dir];
                                    if(nr<0||nr>=N||nc<0||nc>=N||visited[nr][nc]) continue;
                                    if(detail[nr][nc]!=0&&detail[nr][nc]!=detail[i][j]){
                                        result= Math.min(result, count);
                                        break Loop;
                                    }
                                    queue.add(new Node(nr,nc));
                                    visited[nr][nc]=true;
                                }
                            }
                            count++;
                        }
                    }
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void makeDetail(){
        int islandCount=1;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(map[i][j]==1&&detail[i][j]==0){
                    detail[i][j]=islandCount;
                    Queue<Node> queue = new LinkedList<>();
                    queue.add(new Node(i,j));;
                    while (!queue.isEmpty()){
                        int size = queue.size();
                        for(int s=0;s<size;s++){
                            Node now = queue.poll();
                            for(int d=0;d<4;d++){
                                int row = now.x + dx[d];
                                int col = now.y + dy[d];
                                if(row<0||row>=N||col<0||col>=N||map[row][col]==0||detail[row][col]!=0) continue;
                                detail[row][col]=islandCount;
                                queue.add(new Node(row,col));
                            }
                        }
                    }
                    islandCount++;
                }
            }
        }
    }
}
