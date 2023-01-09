// BOJ_2566_최댓값

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2566 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max =0;
        int row =1;
        int col =1;
        for(int i=1;i<=9;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1;j<=9;j++) {
                int num = Integer.parseInt(st.nextToken());
                if(max<num){
                    max=num;
                    row=i;
                    col=j;
                }
            }
        }
        /* ==========output========== */
        System.out.println(max);
        System.out.println(row + " " + col);
        br.close();
    }
}
