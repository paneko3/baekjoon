// BOJ_11023_더하기 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11023 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        while (st.hasMoreTokens()){
            result+=Integer.parseInt(st.nextToken());
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}