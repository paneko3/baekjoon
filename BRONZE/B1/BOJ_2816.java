// BOJ_2816_디지털티비

import java.io.*;
import java.util.*;

public class BOJ_2816 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(br.readLine());
		}

		/* ==========sol========== */
		StringBuilder sb = new StringBuilder();
		int pointer = 0;
		int idx = list.indexOf("KBS1");
		while (pointer < idx) {
			sb.append("1"); pointer++;
		}
		while (pointer > 0) {
			sb.append("4");
			Collections.swap(list, pointer, pointer - 1);
			pointer--;
		}
		idx = list.indexOf("KBS2");
		while (pointer < idx) {
			sb.append("1"); pointer++;
		}
		while (pointer > 1) {
			sb.append("4");
			Collections.swap(list, pointer, pointer - 1);
			pointer--;
		}

		/* ==========output========== */
		System.out.println(sb);
	}
}
