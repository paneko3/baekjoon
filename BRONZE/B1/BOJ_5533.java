// BOJ_5533_유니크

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5533 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][3];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=0;i<N;i++){
            int result = 0;
            Loop: for(int j=0;j<3;j++){
                for(int k=0;k<N;k++){
                    if(i==k){
                        continue;
                    }
                    if(arr[i][j]==arr[k][j]){
                        continue Loop;
                    }
                }
                result+=arr[i][j];
            }
            System.out.println(result);
        }
        br.close();
    }
}