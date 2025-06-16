// BOJ_30802_웰컴_키트

import java.io.*;
import java.util.*;

public class BOJ_30802 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] sizes = new int[6];
        for (int i = 0; i < 6; i++) {
            sizes[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        /* ==========sol========== */
        // 티셔츠 묶음 계산
        int tshirtBundles = 0;
        for (int i = 0; i < 6; i++) {
            tshirtBundles += (sizes[i] + T - 1) / T;
        }

        // 펜 계산
        int penBundles = N / P;
        int singlePens = N % P;

        /* ==========output========== */
        System.out.println(tshirtBundles);
        System.out.println(penBundles + " " + singlePens);
    }
}
