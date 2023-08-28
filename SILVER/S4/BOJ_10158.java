// BOJ_10158_개미

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10158 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        StringBuilder sb = new StringBuilder(w - Math.abs(w-((p+t)%(2*w))) + " " + (h - Math.abs(h-((q+t)%(2*h)))));
        System.out.println(sb);
        br.close();
    }
}