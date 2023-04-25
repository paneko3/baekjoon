// BOJ_2578_빙고

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2578 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] map = new int[5][5];
        for(int i=0;i<5;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int result=0;
        for(int r=0;r<5;r++){
            st = new StringTokenizer(br.readLine());
            for(int c=0;c<5;c++) {
                int num = Integer.parseInt(st.nextToken());
                result++;
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (map[i][j] == num) {
                            map[i][j] = 0;
                        }
                    }
                }
                int bingo = 0;
                int countR=0;
                int countC=0;
                for (int i = 0; i < 5; i++) {
                    if (map[i][i] == 0) {
                        countR++;
                    }
                    if (map[i][4 - i] == 0) {
                        countC++;
                    }
                }
                if (countR == 5) {
                    bingo++;
                }
                if (countC == 5) {
                    bingo++;
                }
                for (int i = 0; i < 5; i++) {
                    countR=0;
                    countC=0;
                    for (int j = 0; j < 5; j++) {
                        if (map[i][j] == 0) {
                            countR++;
                        }
                    }
                    if (countR == 5) {
                        bingo++;
                    }
                    for (int j = 0; j < 5; j++) {
                        if (map[j][i] == 0) {
                            countC++;
                        }
                    }
                    if (countC == 5) {
                        bingo++;
                    }
                }
                if (bingo >= 3) {
                    System.out.println(result);
                    return;
                }
            }
        }
        br.close();
    }
}