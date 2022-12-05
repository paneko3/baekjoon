// BOJ_2010_플러그

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2010 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 1-N;
        for(int i=0;i<N;i++){
            result+=Integer.parseInt(br.readLine());
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
