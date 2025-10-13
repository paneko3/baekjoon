// BOJ_1388_바닥 장식

import java.io.*;
import java.util.*;

public class BOJ_1388 {

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        char[][] floor = new char[N][M];
        for (int i = 0; i < N; i++) {
            floor[i] = br.readLine().toCharArray();
        }

        /* ==========sol========== */
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (floor[i][j] == '-') {
                    if (j == 0 || floor[i][j - 1] == '|') {
                        count++;
                    }
                }
            }
        }
        
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                if (floor[i][j] == '|') {
                    if (i == 0 || floor[i - 1][j] == '-') {
                        count++;
                    }
                }
            }
        }

        /* ==========output========== */
        System.out.println(count);
        br.close();
    }
}
