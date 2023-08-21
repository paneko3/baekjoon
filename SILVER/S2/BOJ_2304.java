// BOJ_2304_창고 다각형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2304 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);
        int result = 0;
        for(int i=0;i<N;){
            int j=i+1; int max = j;
            while(j<N && arr[i][1]>arr[j][1]){
                if(arr[max][1]<arr[j++][1]) max = j-1;
            }
            if(j>=N){
                result+=arr[i][1];
                if(max<N) {
                    result+=arr[max][1]*(arr[max][0]-arr[i][0]-1);
                }
                i=max;
            }else{
                result+= arr[i][1]*(arr[j][0]-arr[i][0]);
                i=j;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}