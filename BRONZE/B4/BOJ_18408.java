// BOJ_18408_3 つの整数 (Three Integers)

import java.io.*;
import java.util.*;

public class BOJ_18408 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count1 = 0;
        int count2 = 0;

        /* ==========sol========== */
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 1) {
            	count1++;
            } else {
            	count2++;
            }
        }

        int result = (count1 > count2) ? 1 : 2;

        /* ==========output========== */
        System.out.println(result);
		br.close();
	}
}