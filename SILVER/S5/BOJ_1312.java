// BOJ_1312_소수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1312 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result = A%B;
        for(int i=0;i<N-1;i++){
            result*=10;
            result%=B;
        }
        result*=10;
        /* ==========output========== */
        System.out.println(result/B);
        br.close();
    }
}