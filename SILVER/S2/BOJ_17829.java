// BOJ_17829_222-풀링

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_17829 {
    static int result;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] mat = new int[N][N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                mat[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        result=0;
        recur(mat,N);
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void recur(int[][] mat, int size){
        if(size==1){
            result = mat[0][0];
            return;
        }
        int[][] temp = new int[size/2][size/2];
        for(int i=0;i<size/2;i++){
            for(int j=0;j<size/2;j++){
                int[] mini = new int[4];
                mini[0]=mat[i*2][j*2];
                mini[1]=mat[i*2+1][j*2];
                mini[2]=mat[i*2][j*2+1];
                mini[3]=mat[i*2+1][j*2+1];
                Arrays.sort(mini);
                temp[i][j]=mini[2];
            }
        }
        recur(temp,size/2);
    }
}