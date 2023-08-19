// BOJ_1834_나머지와 몫이 같은 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1834 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        /* ==========sol========== */
        long result = 0;
        for(int i=1;i<N;i++){
            result+=i*(N+1);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}