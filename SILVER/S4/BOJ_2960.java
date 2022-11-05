// BOJ_2960_에라토스테네스의 체

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2960 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        boolean[] arr = new boolean[N+1];
        int count=0;
        /* ==========output========== */
        for(int i=2;i<=N;i++){
            if(!arr[i]){
                for(int j=i;j<=N;j+=i){
                    if(arr[j]){
                        continue;
                    }
                    arr[j]=true;
                    count++;
                    if(count==K){
                        System.out.println(j);
                        return;
                    }
                }
            }
        }
        br.close();
    }
}
