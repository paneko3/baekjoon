// BOJ_3184_양

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_3184 {
    static int R, C, s, w;
    static char[][] map;
    static boolean[][] visit;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
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
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        visit = new boolean[R][C];
        for(int i=0;i<R;i++){
            String str = br.readLine();
            for(int j=0;j<C;j++){
                map[i][j]=str.charAt(j);
            }
        }
        /* ==========sol========== */
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(!visit[i][j]&&map[i][j]!='#'){
                    bfs(i,j);
                }
            }
        }
        /* ==========output========== */
        System.out.println(s + " " + w);
        br.close();
    }
    static void bfs(int x, int y){
        int tempS = 0;
        int tempW = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x,y));
        visit[x][y]=true;
        while (!queue.isEmpty()){
            Node node = queue.poll();
            int r = node.x;
            int c = node.y;
            if(map[r][c]=='o'){
                tempS++;
            }else if(map[r][c]=='v'){
                tempW++;
            }
            for(int dir=0;dir<4;dir++){
                int nr = r + dx[dir];
                int nc = c + dy[dir];
                if(nr<0||nr>=R||nc<0||nc>=C){
                    return;
                }
                if(map[nr][nc]=='#'||visit[nr][nc]){
                    continue;
                }
                queue.add(new Node(nr,nc));
                visit[nr][nc]=true;
            }
        }
        if(tempS>tempW){
            s+=tempS;
        }else {
            w+=tempW;
        }
    }
}