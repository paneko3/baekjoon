// BOJ_1652_누울 자리를 찾아라

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1652 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] map = new char[N][N];
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<N;j++){
                map[i][j] = str.charAt(j);
            }
        }
        /* ==========sol========== */
        int result1 = 0;
        int result2 = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i<N-1){
                    if(map[i][j]=='.'&&map[i+1][j]=='.'&&(i+2>=N||map[i+2][j]=='X')){
                        result2++;
                    }
                }
                if(j<N-1){
                    if(map[i][j]=='.'&&map[i][j+1]=='.'&&(j+2>=N||map[i][j+2]=='X')){
                        result1++;
                    }
                }
            }
        }
        /* ==========output========== */
        System.out.print(result1 + " " + result2);
        br.close();
    }
}