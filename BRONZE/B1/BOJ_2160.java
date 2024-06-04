// BOJ_2160_그림 비교

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2160 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][][] map = new char[N][5][7];
        for(int i=0;i<N;i++){
            for(int x=0;x<5;x++){
                String str = br.readLine();
                for(int y=0;y<7;y++){
                    map[i][x][y]=str.charAt(y);
                }
            }
        }
        /* ==========sol========== */
        int min = Integer.MAX_VALUE;
        int result1 = 0;
        int result2 = 0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int count = 0;
                for(int x=0;x<5;x++){
                    for(int y=0;y<7;y++){
                        if(map[i][x][y]!=map[j][x][y]){
                            count++;
                        }
                    }
                }
                if(count<min){
                    result1=i;
                    result2=j;
                    min=count;
                }
            }
        }
        /* ==========output========== */
        System.out.println((result1+1) + " " + (result2+1));
        br.close();
    }
}