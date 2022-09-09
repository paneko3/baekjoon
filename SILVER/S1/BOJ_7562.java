// BOJ_7562_나이트의 이동

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_7562 {
    static int[] dx ={-2,-1,1,2,2,1,-1,-2};
    static int[] dy ={1,2,2,1,-1,-2,-2,-1};
    static class Node{
        int x,y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T=Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            int I = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            int result=0;
            boolean[][] visited = new boolean[I][I];
            Queue<Node> queue = new LinkedList<>();
            queue.add(new Node(x1,y1));
            visited[x1][y1]= true;
            Loop:while (!queue.isEmpty()){
                int size = queue.size();
                for(int i=0;i<size;i++){
                    Node now = queue.poll();
                    if(now.x==x2&&now.y==y2){
                        break Loop;
                    }
                    for(int dir=0;dir<8;dir++){
                        int row = now.x +dx[dir];
                        int col = now.y +dy[dir];
                        if(row<0||row>=I||col<0||col>=I||visited[row][col]) continue;
                        visited[row][col]=true;
                        queue.add(new Node(row,col));
                    }
                }
                result++;
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}
