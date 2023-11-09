// BOJ_3985_롤 케이크

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3985 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int L = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int[] cake = new int[L+1];
        int[] count = new int[N+1];
        int max = 0;
        int result1 = 0;
        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            for(int j=P;j<=K;j++){
                if(cake[j]==0){
                    cake[j]=i;
                }
            }
            if(K-P-1>max){
                max=K-P-1;
                result1=i;
            }
        }
        for(int i=1;i<=L;i++){
            if(cake[i]!=0){
                count[cake[i]]++;
            }
        }
        int result2 = 0;
        max=0;
        for(int i=1;i<=N;i++){
            if(count[i]>max){
                result2=i;
                max = count[i];
            }
        }
        /* ==========output========== */
        System.out.println(result1);
        System.out.println(result2);
        br.close();
    }
}