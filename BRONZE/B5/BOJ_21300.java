// BOJ_21300_BottleReturn

import java.io.*;
import java.util.*;

public class BOJ_21300 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		/* ==========sol========== */
		int result = 0;
		for (int i = 0; i < 6; i++) result += Integer.parseInt(st.nextToken()) * 5;
		/* ==========output========== */
		System.out.println(result);
	}
}
