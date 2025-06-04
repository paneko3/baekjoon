// BOJ_20528_끝말잇기

import java.io.*;
import java.util.*;

public class BOJ_20528 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] words = br.readLine().split(" ");

		/* ==========sol========== */
		int[] in = new int[26], out = new int[26];
		boolean[] used = new boolean[26];
		for (String word : words) {
			int s = word.charAt(0) - 'a';
			int e = word.charAt(word.length() - 1) - 'a';
			out[s]++;
			in[e]++;
			used[s] = used[e] = true;
		}

		int start = 0, end = 0;
		for (int i = 0; i < 26; i++) {
			if (in[i] == out[i]) continue;
			else if (out[i] == in[i] + 1) start++;
			else if (in[i] == out[i] + 1) end++;
			else {
				System.out.println(0);
				return;
			}
		}

		/* ==========output========== */
		System.out.println((start == 1 && end == 1 || start == 0 && end == 0) ? 1 : 0);
	}
}
