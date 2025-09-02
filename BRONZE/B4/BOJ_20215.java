// BOJ_20215_Cutting Corners

import java.io.*;
import java.util.*;

public class BOJ_20215 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double w = Double.parseDouble(st.nextToken());
        double h = Double.parseDouble(st.nextToken());
        /* ==========sol========== */
        double rectangularCut = w + h;
        double diagonalCut = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
        double difference = rectangularCut - diagonalCut;
        /* ==========output========== */
        System.out.println(difference);
        br.close();
    }
}
