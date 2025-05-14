// BOJ_20920_영단어 암기는 괴로워

import java.io.*;
import java.util.*;

public class BOJ_20920 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			if (s.length() >= m) {
				if (map.containsKey(s)) {
					map.put(s, map.get(s) + 1);
				} else {
					map.put(s, 1);
				}
			}
		}
		/* ==========sol========== */
		List<String> list = new ArrayList<>(map.keySet());
		list.sort((a, b) -> {
			int c1 = map.get(b) - map.get(a);
			if (c1 != 0) {
				return c1;
			}
			if (b.length() != a.length()) {
				return b.length() - a.length();
			}
			return a.compareTo(b);
		});
		/* ==========output========== */
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append("\n");
		}
		System.out.print(sb);
		br.close();
	}
}