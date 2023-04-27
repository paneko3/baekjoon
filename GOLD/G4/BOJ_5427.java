// BOJ_5427_불

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_5427 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static class Node{
        int r,c;
        public Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        LOOP:for(int test_case=1;test_case<=T;test_case++){
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            char[][] map = new char[h][w];
            boolean[][] visit = new boolean[h][w];
            Queue<Node> queue = new LinkedList<>();
            Queue<Node> fires = new LinkedList<>();
            for(int i=0;i<h;i++){
                String str = br.readLine();
                for(int j=0;j<w;j++){
                    map[i][j]=str.charAt(j);
                    if(map[i][j]=='@'){
                        queue.add(new Node(i,j));
                        visit[i][j]=true;
                    }else if(map[i][j]=='*'){
                        fires.add(new Node(i,j));
                        visit[i][j]=true;
                    }
                }
            }
            int result=0;
            while (!queue.isEmpty()){
                int size = fires.size();
                result++;
                for(int k=0;k<size;k++){
                    Node fire = fires.poll();
                    for(int dir=0;dir<4;dir++){
                        int r = fire.r + dx[dir];
                        int c = fire.c + dy[dir];
                        if(r<0||r>=h||c<0||c>=w){
                            continue ;
                        }
                        if(map[r][c]=='.'&&!visit[r][c]){
                            fires.add(new Node(r,c));
                            visit[r][c]=true;
                        }
                    }
                }
                size = queue.size();
                for(int k=0;k<size;k++){
                    Node now = queue.poll();
                    for(int dir=0;dir<4;dir++){
                        int r = now.r + dx[dir];
                        int c = now.c + dy[dir];
                        if(r<0||r>=h||c<0||c>=w){
                            System.out.println(result);
                            continue LOOP;
                        }
                        if(map[r][c]=='.'&&!visit[r][c]){
                            queue.add(new Node(r,c));
                            visit[r][c]=true;
                        }
                    }
                }

            }
            System.out.println("IMPOSSIBLE");
        }
        br.close();
    }
}