// BOJ_11945_뜨거운 붕어빵

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11945 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++)  {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                System.out.print(str.charAt(M - j - 1));
            }
            System.out.println();
        }
        br.close();
    }
}
