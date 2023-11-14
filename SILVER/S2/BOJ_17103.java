// BOJ_17103_골드바흐 파티션

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[1000001];
        for(int i=2;i*i<=1000000;i++){
            if(!arr[i]){
                for(int j=i+i;j<=1000000;j+=i){
                    arr[j]=true;
                }
            }
        }
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            /* ==========input========== */
            int N = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            int result = 0;
            for(int j=2;j<=N/2;j++){
                if(!arr[j]&&!arr[N-j]){
                    result++;
                }
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}