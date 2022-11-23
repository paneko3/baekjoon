// BOJ_2738_행렬 덧셈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2738 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        for(int k=0;k<2;k++){
            for(int i=0;i<N;i++){
                st=new StringTokenizer(br.readLine());
                for(int j=0;j<M;j++){
                    arr[i][j]+=Integer.parseInt(st.nextToken());
                }
            }
        }
        /* ==========output========== */
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        br.close();
    }
}
