// BOJ_9085_더하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1; test_case<=T;test_case++){
            /* ==========input========== */
            /* ==========sol========== */
            int N = Integer.parseInt(br.readLine());
            int result=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++){
                result+=Integer.parseInt(st.nextToken());
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}
