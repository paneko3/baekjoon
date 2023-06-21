// BOJ_17256_달달함이 넘쳐흘러

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17256 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[2][3];
        for(int i=0;i<2;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++){
               arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========output========== */
        System.out.println((arr[1][0]-arr[0][2])+" " +(arr[1][1]/arr[0][1])+" "+(arr[1][2]-arr[0][0]));
        br.close();
    }
}