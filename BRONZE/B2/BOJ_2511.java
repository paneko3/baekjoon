// BOJ_2511_카드놀이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2511 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] num = new int[2][10];
        for(int i=0;i<2;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<10;j++){
                num[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        int a = 0;
        int b = 0;
        char temp='D';
        for(int i=0;i<10;i++){
            if(num[0][i]>num[1][i]){
                a+=3;
                temp='A';
            }else if(num[0][i]==num[1][i]){
                a+=1;
                b+=1;
            }else {
                b+=3;
                temp='B';
            }
        }
        /* ==========output========== */
        System.out.println(a + " "+b);
        System.out.println(a==b?(temp=='D'?"D":temp):(a>b?"A":"B"));
        br.close();
    }
}