// BOJ_16395_파스칼의 삼각형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16395 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[][] arr = new int[31][31];
        for(int i=1;i<=30;i++){
            arr[i][1]=1;
            arr[1][i]=1;
        }
        for(int i=2;i<=30;i++){
            for(int j=2;j<=30;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
        /* ==========output========== */
        System.out.println(arr[n-k+1][k]);
        br.close();
    }
}