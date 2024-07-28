// BOJ_4396_지뢰 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4396 {
    static int[] dx = {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] answer = new char[n][n];
        char[][] map = new char[n][n];
        for(int i=0;i<n;i++){
            String str = br.readLine();
            for(int j=0;j<n;j++){
                answer[i][j]=str.charAt(j);
            }
        }
        for(int i=0;i<n;i++){
            String str = br.readLine();
            for(int j=0;j<n;j++){
                map[i][j]=str.charAt(j);
            }
        }
        char[][] result = new char[n][n];
        /* ==========sol========== */
        boolean flag = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(answer[i][j]=='*'&&map[i][j]=='x'){
                    flag=true;
                }else if(map[i][j]=='.'){
                    result[i][j]='.';
                }else {
                    int count = 0;
                    for(int d=0;d<8;d++){
                        int r = i+dx[d];
                        int c = j+dy[d];
                        if(r<0||r>=n||c<0||c>=n){
                            continue;
                        }
                        if(answer[r][c]=='*'){
                            count++;
                        }
                    }
                    result[i][j]=(char)('0'+count);
                }
            }
        }
        if(flag){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(answer[i][j]=='*'){
                        result[i][j]='*';
                    }
                }
            }
        }
        /* ==========output========== */
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
        br.close();
    }
}