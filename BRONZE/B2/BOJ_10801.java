// BOJ_10801_카드게임

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10801 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[2][10];
        for(int i=0;i<2;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<10;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        int a = 0;
        int b = 0;
        for(int i=0;i<10;i++){
            if(arr[0][i]>arr[1][i]){
                a++;
            }else if(arr[0][i]<arr[1][i]){
                b++;
            }
        }
        /* ==========output========== */
        System.out.println(a==b?"D":(a>b?"A":"B"));
        br.close();
    }
}