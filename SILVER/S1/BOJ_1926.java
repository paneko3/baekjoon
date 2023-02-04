// BOJ_1926_그림

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1926 {
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                map[i][j]= Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        int result1=0;
        int result2=0;
        boolean[][] check = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int count=0;
                if(map[i][j]==1&&!check[i][j]){
                    result1++;
                    Queue<Node> queue = new LinkedList<>();
                    queue.add(new Node(i,j));
                    check[i][j]=true;
                    count++;
                    while(!queue.isEmpty()){
                        Node node = queue.poll();
                        for(int dir=0;dir<4;dir++){
                            int row = node.x+dx[dir];
                            int col = node.y+dy[dir];
                            if(row<0||row>=n||col<0||col>=m||check[row][col]||map[row][col]==0){
                                continue;
                            }
                            queue.add(new Node(row,col));
                            check[row][col]=true;
                            count++;
                        }
                    }
                    result2=Math.max(result2,count);
                }
            }
        }
        /* ==========output========== */
        System.out.println(result1);
        System.out.println(result2);
        br.close();
    }
}
