// BOJ_1297_TV 크기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1297 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        double x =Math.sqrt(Math.pow(D,2) /(Math.pow(H,2) + Math.pow(W,2)));
        /* ==========output========== */
        System.out.println((int)(x*H) + " " +(int)(x*W));
        br.close();
    }
}
