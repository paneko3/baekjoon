// BOJ_9076_점수 집계

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_9076 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int[] score = new int[5];
            for(int j=0;j<5;j++){
                score[j]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(score);
            if(score[3]-score[1]>=4){
                System.out.println("KIN");
            }else {
                System.out.println(score[1]+score[2]+score[3]);
            }
        }
        br.close();
    }
}