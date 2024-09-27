// BOJ_17206_준석이의 수학 숙제

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_17206 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<T;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		/* ==========sol========== */
		long[] sumThree = new long[80001];
        long[] sumSeven = new long[80001];
        long temp = 0;
        for (int i = 1; i <= 80000; i++) {
            if (i % 3 == 0) {
                temp += i;
            }
            sumThree[i] = temp;
        }
        temp = 0;
        for (int i = 1; i <= 80000; i++) {
            if (i % 7 == 0 && i % 3 != 0) {
                temp += i;
            }
            sumSeven[i] = temp;
        }
		/* ==========output========== */
        for (int i = 0; i < T; i++) {
            long result = sumThree[arr[i]] + sumSeven[arr[i]];
            System.out.println(result);
        }
		br.close();
	}
}
