// BOJ_29751_삼각형

import java.io.*;
import java.util.*;

public class BOJ_29751 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double w = Double.parseDouble(st.nextToken());
        double h = Double.parseDouble(st.nextToken());

        /* ==========sol========== */
        double area = (w * h) / 2.0;

        /* ==========output========== */
        System.out.printf("%.1f\n", area);
        br.close();
    }
}
