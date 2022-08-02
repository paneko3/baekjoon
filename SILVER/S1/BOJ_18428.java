// BOJ_18428_감시 피하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_18428 {
    static int N;
    static Node[] select;
    static ArrayList<Node> nodes;
    static int[] dx ={0,1,0,-1};
    static int[] dy ={1,0,-1,0};
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
        StringTokenizer st;
        N=Integer.parseInt(br.readLine());
        char[][]map=new char[N][N];
        nodes=new ArrayList<>();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                map[i][j]= st.nextToken().charAt(0);
                if(map[i][j]=='X'){
                    nodes.add(new Node(i,j));
                }
            }
        }
        /* ==========sol========== */
        select= new Node[nodes.size()];
        com(0,0,map);
        /* ==========output========== */
        System.out.println("NO");
        br.close();
    }
    static void com(int count,int start,char[][] map){
        if(count==3){
            for(int i=0;i<3;i++){
                Node node = select[i];
                map[node.x][node.y]= 'O';
            }
            check(map);
            for(int i=0;i<3;i++){
                Node node = select[i];
                map[node.x][node.y]= 'X';
            }
            return;
        }
        for(int i=start;i< nodes.size();i++){
            select[count]=nodes.get(i);
            com(count+1,i+1,map);
        }
    }
    static void check(char[][] map){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(map[i][j]=='T'){
                    for(int dir=0;dir<4;dir++){
                        int row =i;
                        int col =j;
                        while (true){
                            row+=dx[dir];
                            col+=dy[dir];
                            if(row<0||row>=N||col<0||col>=N) break;
                            if(map[row][col]=='O') break;
                            if(map[row][col]=='S') return;
                        }
                    }
                }
            }
        }
        System.out.println("YES");
        System.exit(0);
    }
}
