// BOJ_1411_비슷한 단어

import java.io.*;
import java.util.*;

public class BOJ_1411 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] words = new String[N];
		for (int i = 0; i < N; i++) {
			words[i] = br.readLine();
		}

		/* ==========sol========== */
		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (isSimilar(words[i], words[j])) count++;
			}
		}

		/* ==========output========== */
		System.out.println(count);
		br.close();
		br.close();
	}
	static boolean isSimilar(String a, String b) {
		Map<Character, Integer> mapA = new HashMap<>();
		Map<Character, Integer> mapB = new HashMap<>();
		int[] patternA = new int[a.length()];
		int[] patternB = new int[b.length()];
		int indexA = 0, indexB = 0;

		for (int i = 0; i < a.length(); i++) {
			char ca = a.charAt(i), cb = b.charAt(i);

			if (!mapA.containsKey(ca)) mapA.put(ca, indexA++);
			if (!mapB.containsKey(cb)) mapB.put(cb, indexB++);

			patternA[i] = mapA.get(ca);
			patternB[i] = mapB.get(cb);
		}

		return Arrays.equals(patternA, patternB);
	}
}