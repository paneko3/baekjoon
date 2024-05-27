// BOJ_21964_선린인터넷고등학교 교가

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_21964 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(str.substring(N-5,N));
        br.close();
    }
}