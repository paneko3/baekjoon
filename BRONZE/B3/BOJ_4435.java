// BOJ_4435_중간계 전쟁

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4435 {
    static int[][] arr = {{1,2,3,3,4,10},{1,2,2,2,3,5,10}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int t=1;t<=T;t++){
            /* ==========input========== */
            int score1 = 0;
            int score2 = 0;
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<arr[0].length;i++){
                score1+=Integer.parseInt(st.nextToken())*arr[0][i];
            }
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<arr[1].length;i++){
                score2+=Integer.parseInt(st.nextToken())*arr[1][i];
            }
            /* ==========sol========== */
            /* ==========output========== */
            System.out.print("Battle " + t + ": ");
            if(score1>score2){
                System.out.println("Good triumphs over Evil");
            }else if(score1<score2){
                System.out.println("Evil eradicates all trace of Good");
            }else {
                System.out.println("No victor on this battle field");
            }
        }
        br.close();
    }
}