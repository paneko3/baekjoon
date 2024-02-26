// BOJ_25494_단순한 문제 (Small)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25494 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int t=0;t<T;t++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            int result = 0;
            for(int i=1;i<=a;i++){
                for(int j=1;j<=b;j++){
                    for(int k=1;k<=c;k++){
                        if(i%j==j%k&&i%j==k%i){
                            result++;
                        }
                    }
                }
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}