// BOJ_1773_폭죽쇼

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1773 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        boolean[] arr = new boolean[C+1];
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            for(int j=num;j<=C;j+=num){
                arr[j]=true;
            }
        }
        /* ==========sol========== */
        int result = 0;
        for(int i=1;i<=C;i++){
            if (arr[i]){
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}