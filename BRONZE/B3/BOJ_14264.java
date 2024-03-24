// BOJ_14264_정육각형과 삼각형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14264 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double L = Double.parseDouble(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println((Math.sqrt(3)/4)*Math.pow(L,2));
        br.close();
    }
}