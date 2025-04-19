// BOJ_2783_삼각 김밥

import java.io.*;
import java.util.*;

public class BOJ_2783 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double X = Double.parseDouble(st.nextToken());
        double Y = Double.parseDouble(st.nextToken());
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        double minCost = (X / Y) * 1000;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            double Xi = Double.parseDouble(st.nextToken());
            double Yi = Double.parseDouble(st.nextToken());
            double cost = (Xi / Yi) * 1000;
            if (cost < minCost) {
                minCost = cost;
            }
        }
        /* ==========output========== */
        System.out.printf("%.2f\n", minCost);
		br.close();
	}
}