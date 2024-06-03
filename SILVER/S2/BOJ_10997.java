// BOJ_10997_별 찍기 - 22

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10997 {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        if(N==1){
            System.out.println("*");
            return;
        }
        char[][] map = new char[4*N-1][4*N-3];
        int x = 2*N;
        int y = 2*(N-1);
        int d = 0;
        int count = 2;
        map[x][y]='*';
        for(int i=0;i<2*N-1;i++){
            for(int j=0;j<count;j++){
                x+=dx[d];
                y+=dy[d];
                map[x][y]='*';
            }
            d=(d==3)?0:d+1;
            for(int j=0;j<count;j++){
                x+=dx[d];
                y+=dy[d];
                if(x==0&&y==(4*N-3)){
                    break;
                }
                map[x][y]='*';
            }
            d=(d==3)?0:d+1;
            count+=2;

        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<4*N-1;i++){
            for(int j=0;j<4*N-3;j++){
                sb.append(map[i][j]=='*'?'*':' ');
                if(i==1){
                    break;
                }
            }
            sb.append("\n");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}