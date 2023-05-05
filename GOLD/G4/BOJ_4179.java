// BOJ_4179_불!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_4179 {
    static int[] dr = {0,1,0,-1};
    static int[] dc = {1,0,-1,0};
    static class Node{
        int r,c;
        public Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char[][] map = new char[R][C];
        boolean[][] visit = new boolean[R][C];
        Queue<Node> queue = new LinkedList<>();
        Queue<Node> fires = new LinkedList<>();
        for(int i=0;i<R;i++){
            String str = br.readLine();
            for(int j=0;j<C;j++){
                map[i][j]=str.charAt(j);
                if(map[i][j]=='J'){
                    queue.add(new Node(i,j));
                    visit[i][j]=true;
                }else if(map[i][j]=='F'){
                    fires.add(new Node(i,j));
                    visit[i][j]=true;
                }
            }
        }
        /* ==========sol========== */
        /* ==========output========== */
        int result = 0;
        while (!queue.isEmpty()){
            result++;
            int size = fires.size();
            for(int i=0;i<size;i++){
                Node node = fires.poll();
                for(int dir=0;dir<4;dir++){
                    int nr = node.r + dr[dir];
                    int nc = node.c + dc[dir];
                    if(nr<0||nr>=R||nc<0||nc>=C){
                        continue;
                    }
                    if(map[nr][nc]!='#'&&!visit[nr][nc]){
                        fires.add(new Node(nr,nc));
                        visit[nr][nc]=true;
                    }
                }
            }
            size = queue.size();
            for(int i=0;i<size;i++){
                Node node = queue.poll();
                for(int dir=0;dir<4;dir++){
                    int nr = node.r + dr[dir];
                    int nc = node.c + dc[dir];
                    if(nr<0||nr>=R||nc<0||nc>=C){
                        System.out.println(result);
                        return;
                    }
                    if(map[nr][nc]=='.'&&!visit[nr][nc]){
                        queue.add(new Node(nr,nc));
                        visit[nr][nc]=true;
                    }
                }
            }

        }
        System.out.println("IMPOSSIBLE");
        br.close();
    }
}