// BOJ_2589_보물섬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2589 {
    static int[] dx={0,-1,0,1};
    static int[] dy={1,0,-1,0};
    static class Node{
       int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int L=Integer.parseInt(st.nextToken());
        char[][] map = new char[N][L];
        for(int i=0;i<N;i++){
            String str= br.readLine();
            for(int j=0;j<L;j++){
                map[i][j]=str.charAt(j);
            }
        }
        /* ==========sol========== */
        int result=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<L;j++){
                if(map[i][j]=='L'){
                    boolean[][] visited = new boolean[N][L];
                    Queue<Node> queue = new LinkedList<>();
                    queue.add(new Node(i,j));
                    visited[i][j]=true;
                    int count=0;
                    while (!queue.isEmpty()){
                        int size=queue.size();
                        for(int k=0;k<size;k++){
                            Node now = queue.poll();
                            for(int dir=0;dir<4;dir++){
                                int row = now.x+dx[dir];
                                int col = now.y+dy[dir];
                                if(row<0||row>=N||col<0||col>=L||visited[row][col]||map[row][col]=='W') {
                                    continue;
                                }
                                visited[row][col]=true;
                                queue.add(new Node(row,col));
                            }
                        }
                        count++;
                    }
                    result=Math.max(result,count);
                }
            }
        }
        /* ==========output========== */
        System.out.println(result>1?result-1:result);
        br.close();
    }
}
