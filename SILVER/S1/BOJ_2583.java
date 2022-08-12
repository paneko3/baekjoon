// BOJ_2583_영역 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2583 {
    static class Node{
        int x,y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int [] dx= {0,1,0,-1};
    static int [] dy= {1,0,-1,0};

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M= Integer.parseInt(st.nextToken());
        int N= Integer.parseInt(st.nextToken());
        int K= Integer.parseInt(st.nextToken());
        int[][] map=new int[M][N];
        for(int k=0;k<K;k++){
            st= new StringTokenizer(br.readLine());
            int y1=Integer.parseInt(st.nextToken());
            int x1=Integer.parseInt(st.nextToken());
            int y2=Integer.parseInt(st.nextToken());
            int x2=Integer.parseInt(st.nextToken());
            for(int i=x1;i<x2;i++){
                for(int j=y1;j<y2;j++){
                    map[i][j]=1;
                }
            }
        }
        /* ==========sol========== */
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(map[i][j]==0){
                    Queue<Node> queue = new LinkedList<>();
                    queue.add(new Node(i,j));
                    int count=0;
                    boolean[][] visited = new boolean[M][N];
                    visited[i][j]=true;
                    while (!queue.isEmpty()){
                        Node now = queue.poll();

                        count++;
                        for(int dir=0;dir<4;dir++){
                            int row=now.x+dx[dir];
                            int col=now.y+dy[dir];
                            if(row<M&&row>=0&&col<N&&col>=0&&!visited[row][col]&&map[row][col]==0){
                                queue.add(new Node(row, col));
                                visited[row][col]=true;
                                map[row][col]=1;
                            }
                        }
                    }
                    list.add(count);
                }
            }
        }
        Collections.sort(list);
        /* ==========output========== */
        System.out.println(list.size());
        for(int node: list){
            System.out.print(node+" ");
        }
        br.close();
    }
}
