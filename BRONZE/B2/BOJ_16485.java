// BOJ_16485_작도하자! - ②

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16485 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double c = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(Math.max(c,b)/Math.min(c,b));
        br.close();
    }
}
