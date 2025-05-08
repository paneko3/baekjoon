// BOJ_4158_CD

import java.io.*;
import java.util.*;

public class BOJ_4158 {
	public static void main(String[] args) throws IOException {
		// ==========input==========
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) break;

            int[] sangGeun = new int[n];
            int[] sunYoung = new int[m];

            for (int i = 0; i < n; i++) {
                sangGeun[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < m; i++) {
                sunYoung[i] = Integer.parseInt(br.readLine());
            }

            // ==========sol==========
            int count = 0;
            int i = 0, j = 0;

            while (i < n && j < m) {
                if (sangGeun[i] == sunYoung[j]) {
                    count++;
                    i++;
                    j++;
                } else if (sangGeun[i] < sunYoung[j]) {
                    i++;
                } else {
                    j++;
                }
            }

            // ==========output==========
            System.out.println(count);
        }
		br.close();
	}
}