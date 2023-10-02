// BOJ_10994_별 찍기 - 19

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10994 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int size = (N-1)*4+1;
        char[][] map = new char[size][size];
        int count = 0;
        for(int k=1;k<=N;k++){
            for(int i=count;i<size-count;i++){
                map[count][i]='*';
                map[size-count-1][i]='*';
                map[i][count]='*';
                map[i][size-count-1]='*';
            }
            count+=2;
        }
        /* ==========output========== */
        for (int i=0;i<(N-1)*4+1;i++){
            for (int j=0;j<(N-1)*4+1;j++){
                System.out.print(map[i][j]=='*'?"*":" ");
            }
            System.out.println();
        }
        br.close();
    }
}