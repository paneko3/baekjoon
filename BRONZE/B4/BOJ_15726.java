// BOJ_15726_이칙연산

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15726 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Double A = Double.parseDouble(st.nextToken());
        Double B = Double.parseDouble(st.nextToken());
        Double C = Double.parseDouble(st.nextToken());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(Math.max((int)((A/B)*C),(int)((A*B)/C)));
        br.close();
    }
}