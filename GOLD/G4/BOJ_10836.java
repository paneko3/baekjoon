// BOJ_10836_여왕벌

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10836 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[][] map = new int[M][M];
        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                map[i][j]=1;
            }
        }
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());
            int row=M-1;
            int col=0;
            while (!(num1==0&&num2==0&&num3==0)){
                if(num1>0){
                    num1--;
                }else if(num2>0){
                    map[row][col]+=1;
                    num2--;
                }else if(num3>0){
                    map[row][col]+=2;
                    num3--;
                }
                if(row>0){
                    row--;
                }else {
                    col++;
                }
            }
        }
        for(int a=1;a<M;a++){
            for(int b=1;b<M;b++){
                map[a][b]=Math.max(Math.max(map[a-1][b],map[a][b-1]),map[a-1][b-1]);
            }
        }
        /* ==========output========== */
        StringBuilder sb = new StringBuilder();
        for(int a=0;a<M;a++){
            for(int b=0;b<M;b++){
                sb.append(map[a][b]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
