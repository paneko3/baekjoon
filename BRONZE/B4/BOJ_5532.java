// BOJ_5532_방학 숙제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5532 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println((int)(L - Math.max(Math.ceil((float)A/C),Math.ceil((float)B/D))));
        br.close();
    }
}
