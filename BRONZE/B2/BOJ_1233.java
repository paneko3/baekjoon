// BOJ_1233_주사위

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1233 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S1 = Integer.parseInt(st.nextToken());
        int S2 = Integer.parseInt(st.nextToken());
        int S3 = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[] sum = new int[S1+S2+S3+1];
        int result = 0;
        int max = 0;
        for(int i=1;i<=S1;i++){
            for(int j=1;j<=S2;j++){
                for(int k=1;k<=S3;k++){
                    int n = i+j+k;
                    sum[n]++;
                    if(sum[n]>max){
                        result=n;
                        max=sum[n];
                    }
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}