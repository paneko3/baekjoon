// BOJ_3055_탈출

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_3055 {
    static int[] dx={0,1,0,-1};
    static int[] dy={1,0,-1,0};
    static Node S,D;
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
        int R=Integer.parseInt(st.nextToken());
        int C=Integer.parseInt(st.nextToken());
        char[][] map=new char[R][C];
        boolean[][] visited=new boolean[R][C];
        for(int i=0;i<R;i++){
            String str=br.readLine();
            for (int j=0;j<C;j++){
                if(str.charAt(j)=='S'){
                    S=new Node(i,j);
                }else if(str.charAt(j)=='D'){
                    D=new Node(i,j);
                }
                map[i][j]=str.charAt(j);
            }
        }
        /* ==========sol========== */
        Queue<Node> queue = new LinkedList<>();
        queue.add(S);
        visited[S.x][S.y]=true;
        int result=1;
        while (!queue.isEmpty()){
            int size=queue.size();
            boolean[][] check=new boolean[R][C];
            for(int i=0;i<R;i++){
                for(int j=0;j<C;j++){
                    if(map[i][j]=='*'){
                        check[i][j]=true;
                    }
                }
            }
            for(int i=0;i<R;i++){
                for(int j=0;j<C;j++){
                    if(check[i][j]){
                        for(int dir=0;dir<4;dir++){
                            int r=i+dx[dir];
                            int c=j+dy[dir];
                            if(r<0||r>=R||c<0||c>=C||map[r][c]!='.') {
                                continue;
                            }
                            map[r][c]='*';
                        }
                    }
                }
            }
            for(int k=0;k<size;k++){
                Node now = queue.poll();
                for(int dir=0;dir<4;dir++){
                    int r=now.x+dx[dir];
                    int c=now.y+dy[dir];
                    if(r<0||r>=R||c<0||c>=C||visited[r][c]){
                        continue;
                    }
                    if(map[r][c]=='.'){
                        queue.add(new Node(r,c));
                        visited[r][c]=true;
                    }else if(map[r][c]=='D'){
                        System.out.println(result);
                        return;
                    }
                }
            }

            result++;
        }
        /* ==========output========== */
        System.out.println("KAKTUS");
        br.close();
    }
}
