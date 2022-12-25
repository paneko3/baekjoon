// BOJ_3085_사탕 게임

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3085 {
    static int N, result;
    static char[][] map;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<N;j++){
                map[i][j]=str.charAt(j);
            }
        }
        /* ==========sol========== */
        result=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                char now = map[i][j];
                for(int dir=0;dir<4;dir++){
                    int row = i + dx[dir];
                    int col = j + dy[dir];
                    if(row<0||row>=N||col<0||col>=N||map[row][col]==now){
                        continue;
                    }
                    map[i][j] = map[row][col];
                    map[row][col]=now;
                    for(int a=0;a<N;a++){
                        int count=1;
                        for(int b=0;b<N-1;b++){
                            if(map[a][b]==map[a][b+1]){
                                count++;
                            }else {
                                count=1;;
                            }
                            result=Math.max(result,count);
                        }
                    }
                    for(int a=0;a<N;a++){
                        int count=1;
                        for(int b=0;b<N-1;b++){
                            if(map[b][a]==map[b+1][a]){
                                count++;
                            }else {
                                count=1;;
                            }
                            result=Math.max(result,count);
                        }
                    }
                    char temp = map[i][j];
                    map[i][j] = map[row][col];
                    map[row][col]=temp;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
