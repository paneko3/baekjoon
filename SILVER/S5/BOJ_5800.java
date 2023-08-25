// BOJ_5800_성적 통계

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        for(int i=1;i<=K;i++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] score = new int[N];
            for(int j=0;j<N;j++){
                score[j] = Integer.parseInt(st.nextToken());
            }
            /* ==========sol========== */
            Arrays.sort(score);
            int result = 0;
            for (int j=0;j<N-1;j++){
                result = Math.max(result,score[j+1]-score[j]);

            }
            /* ==========output========== */
            System.out.println("Class " + i);
            System.out.println("Max " + score[N-1] + ", Min " + score[0] + ", Largest gap " + result);
        }
        br.close();
    }
}