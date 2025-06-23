// BOJ_14467_소가길을건너간이유1

import java.io.*;
import java.util.*;

/* ==========input========== */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), result = 0;
		int[] cow = new int[11]; // 소 번호는 1~10
		Arrays.fill(cow, -1);
		
		/* ==========sol========== */
		while (N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int pos = Integer.parseInt(st.nextToken());
			if (cow[num] == -1) { cow[num] = pos; continue; }
			if (cow[num] != pos) {
				cow[num] = pos;
				result++;
			}
		}

		/* ==========output========== */
		System.out.println(result);
	}
}
