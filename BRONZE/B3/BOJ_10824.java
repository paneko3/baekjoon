// BOJ_10824_네 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10824 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A= st.nextToken();
        String B= st.nextToken();
        String C= st.nextToken();
        String D= st.nextToken();
        System.out.println(Long.parseLong(A+B)+Long.parseLong(C+D));
        br.close();
    }
}