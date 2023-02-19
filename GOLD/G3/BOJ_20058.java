// BOJ_20058_마법사 상어와 파이어스톰

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_20058 {
    static int N, Q, size;
    static int[][] map,temp;
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
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());
        size = (int)Math.pow(2,N);
        map = new int[size][size];
        for(int i=0;i<size;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<size;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        for(int k=0;k<Q;k++){
            int L = Integer.parseInt(st.nextToken());
            int subSize = (int)(Math.pow(2,L));
            int sub = size/subSize;
            temp = new int[size][size];
            for(int i=0;i<sub;i++){
                for(int j=0;j<sub;j++){
                    rotate(i*subSize,j*subSize,subSize);
                }
            }
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    map[i][j]=temp[i][j];
                }
            }
            crash();
        }
        int sum = 0;
        int max = 0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                sum+=map[i][j];
            }
        }
        boolean[][] visit = new boolean[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                int count=1;
                if(map[i][j] > 0&&!visit[i][j]){
                    Queue<Node> queue = new LinkedList<>();
                    queue.add(new Node(i,j));
                    visit[i][j]=true;
                    while (!queue.isEmpty()){
                        Node node = queue.poll();
                        for(int dir=0;dir<4;dir++){
                            int row=node.x+dx[dir];
                            int col=node.y+dy[dir];
                            if(row<0||row>=size||col<0||col>=size||map[row][col]==0||visit[row][col]){
                                continue;
                            }
                            queue.add(new Node(row,col));
                            visit[row][col]=true;
                            count++;
                        }
                    }
                }else {
                    visit[i][j]=true;
                }
                if(count>=2){
                    max=Math.max(max,count);
                }
            }
        }
        /* ==========output========== */
        System.out.println(sum);
        System.out.println(max);
        br.close();
    }
    static void crash(){
        boolean[][] check = new boolean[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(map[i][j]==0){
                    continue;
                }
                int count=0;
                for(int dir=0;dir<4;dir++){
                    int row = i+dx[dir];
                    int col = j+dy[dir];
                    if(row<0||row>=size||col<0||col>=size||map[row][col]==0){
                        continue;
                    }
                    count++;
                }
                if(count<3){
                    check[i][j]=true;
                }
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(check[i][j]){
                    map[i][j]--;
                }
            }
        }
    }
    static void rotate(int r, int c, int subSize){
        for(int i=0;i<subSize;i++){
            for(int j=0;j<subSize;j++){
                temp[r+j][c+subSize-i-1]=map[r+i][c+j];
            }
        }
    }
}
