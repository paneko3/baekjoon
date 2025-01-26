// BOJ_31994_강당 대관

import java.io.*;
import java.util.*;

public class BOJ_31994 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		/* ==========sol========== */
		String result = "";
		int max = 0;
		for(int i=0;i<7;i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int N = Integer.parseInt(st.nextToken());
			if(N>max) {
				max=N;
				result = str;
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
