// BOJ_1296_팀이름정하기

import java.io.*;
import java.util.*;

/* ==========input========== */
public class BOJ_1296 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		int N = Integer.parseInt(br.readLine());
		String[] team = new String[N];
		for (int i = 0; i < N; i++) team[i] = br.readLine();

		/* ==========sol========== */
		String result = "";
		int max = -1;
		for (String t : team) {
			int l = count(name, t, 'L');
			int o = count(name, t, 'O');
			int v = count(name, t, 'V');
			int e = count(name, t, 'E');
			int score = ((l + o) * (l + v) * (l + e) * (o + v) * (o + e) * (v + e)) % 100;
			if (score > max || (score == max && t.compareTo(result) < 0)) {
				max = score;
				result = t;
			}
		}

		/* ==========output========== */
		System.out.println(result);
	}

	static int count(String a, String b, char c) {
		int cnt = 0;
		for (char ch : (a + b).toCharArray()) if (ch == c) cnt++;
		return cnt;
	}
}
