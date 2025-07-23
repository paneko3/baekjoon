// BOJ_20291_파일 정리

import java.io.*;
import java.util.*;

public class BOJ_20291 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String[] fileName = br.readLine().split("\\.");
			String extension = fileName[1];
			map.put(extension, map.getOrDefault(extension, 0) + 1);
		}
		/* ==========sol========== */
		List<String> list = new ArrayList<>(map.keySet());
		Collections.sort(list);
		/* ==========output========== */
		for (String key : list) {
			System.out.println(key + " " + map.get(key));
		}
		br.close();
	}
}
