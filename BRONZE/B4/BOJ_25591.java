// BOJ_25591_푸앙이와 종윤이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25591 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int a = 100-x;
        int b = 100-y;
        int c = 100-(a+b);
        int d = a*b;
        int q =d/100;
        int r =d%100;
        /* ==========output========== */
        System.out.println(a + " " + b + " " + c + " " + d + " " + q + " " + r);
        System.out.println((c+q) + " " + r);

        br.close();
    }
}