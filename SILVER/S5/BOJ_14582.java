// BOJ_14582_오늘도 졌다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14582 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] score = new int[2][9];
        for(int i=0;i<2;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                score[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        int a=0;
        int b=0;
        boolean flag = false;
        for(int i=0;i<9;i++){
            a+=score[0][i];
            if(a>b){
                flag=true;
            }
            b+=score[1][i];
        }
        /* ==========output========== */
        System.out.println(a<b&&flag?"Yes":"No");
        br.close();
    }
}