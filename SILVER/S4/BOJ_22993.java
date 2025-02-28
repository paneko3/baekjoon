// BOJ_22993_서든어택 3

import java.io.*;
import java.util.*;

public class BOJ_22993 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		st = new StringTokenizer(br.readLine());
		long X = Long.parseLong(st.nextToken());
		long[] Y = new long[N-1];
		for(int i=0;i<N-1;i++) {
			Y[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(Y);
		for(int i=0;i<N-1;i++) {
			if(X>Y[i]) {
				X+=Y[i];
			}else {
				System.out.println("No");
				return;
			}
		}
		/* ==========output========== */
		System.out.println("Yes");
		br.close();
	}
}
