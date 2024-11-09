// BOJ_11008_복붙의 달인

import java.io.*;
import java.util.*;

public class BOJ_11008 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int t=0;t<T;t++) {
			/* ==========input========== */
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			String copy = st.nextToken();
			/* ==========sol========== */
			int result = 0;
			while(str.contains(copy)) {
				str = str.replaceFirst(copy, "");
				result++;
			}
			/* ==========output========== */
			System.out.println(result+str.length());
		}
		br.close();
	}
}
