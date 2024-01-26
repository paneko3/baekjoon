// BOJ_11024_더하기 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11024 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int result = 0;
            while (st.hasMoreTokens()){
                result+=Integer.parseInt(st.nextToken());
            }
            System.out.println(result);
        }
        br.close();
    }
}