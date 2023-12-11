// BOJ_2116_주사위 쌓기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2116 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] dices = new int[N][6];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<6;j++){
                dices[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        int result = 0;
        for(int k=1;k<=6;k++){
            int sum = 0;
            int num = k;
            for(int i=0;i<N;i++){
                int idx=0;
                for(int j=0;j<6;j++){
                    if(dices[i][j]==num){
                        idx=j;
                        num=dices[i][convert(j)];
                        break;
                    }
                }
                int max = 0;
                for(int j=0;j<6;j++){
                    if(j==idx||j==convert(idx)){
                        continue;
                    }
                    max = Math.max(max,dices[i][j]);
                }
                sum+=max;
            }
            result=Math.max(result,sum);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static int convert(int a){
        switch (a){
            case 0:
                return 5;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 0;
        }
        return 0;
    }
}