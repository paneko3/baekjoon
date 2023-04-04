// BOJ_6359_만취한 상범

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_6359 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            int n = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            int[] num = new int[n+1];
            for(int i=1;i<=n;i++){
                for(int j=1;i*j<=n;j++){
                    num[i*j]=num[i*j]==0?1:0;
                }
            }
            int result=0;
            for(int i=1;i<=n;i++){
                result+=num[i];
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}
