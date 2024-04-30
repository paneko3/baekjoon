// BOJ_5212_지구 온난화

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5212 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char[][] map = new char[R][C];
        for(int i=0;i<R;i++){
            String str = br.readLine();
            for(int j=0;j<C;j++){
                map[i][j]=str.charAt(j);
            }
        }
        /* ==========sol========== */
        boolean[][] check = new boolean[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if (map[i][j] == '.') {
                    continue;
                }
                int count = 0;
                for(int d=0;d<4;d++){
                    int r = i+dx[d];
                    int c = j+dy[d];
                    if(r<0||r>=R||c<0||c>=C){
                        count++;
                        continue;
                    }
                    if(map[r][c]=='.'){
                        count++;
                    }
                }
                if(count>=3){
                    check[i][j]=true;
                }
            }
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(check[i][j]){
                    map[i][j]='.';
                }
            }
        }
        int minX = R-1;
        int minY = C-1;
        int maxX = 0;
        int maxY = 0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(map[i][j]=='X'){
                    minX = Math.min(minX,i);
                    minY = Math.min(minY,j);
                    maxX = Math.max(maxX,i);
                    maxY = Math.max(maxY,j);
                }
            }
        }
        /* ==========output========== */
        for(int i=minX;i<=maxX;i++){
            for(int j=minY;j<=maxY;j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        br.close();
    }
}