// BOJ_1448_삼각형 만들기

import java.io.*;
import java.util.*;

public class BOJ_1448 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] straws = new int[N];
        for (int i = 0; i < N; i++) {
            straws[i] = Integer.parseInt(br.readLine());
        }

        /* ==========sol========== */
        Arrays.sort(straws); // 오름차순 정렬

        int result = -1;
        for (int i = N - 1; i >= 2; i--) {
            int a = straws[i];
            int b = straws[i - 1];
            int c = straws[i - 2];
            if (b + c > a) {
                result = a + b + c;
                break;
            }
        }

        /* ==========output========== */
        System.out.println(result);
	}
}