// BOJ_17173_배수들의 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17173 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[M+1];
        int[] arr2 = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            arr1[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        for(int i=0;i<M;i++){
            for(int j=1;j<=N;j++){
                if(j%arr1[i]==0){
                    arr2[j]=j;
                }
            }
        }
        int result=0;
        for(int i=1;i<=N;i++){
            result+=arr2[i];
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}