// BOJ_3046_R2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3046 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R1=Integer.parseInt(st.nextToken());
        int S=Integer.parseInt(st.nextToken());
        /* ==========output========== */
        System.out.println(2*S-R1);
        br.close();
    }
}
