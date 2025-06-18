// BOJ_24060_알고리즘수업_병합정렬1

import java.io.*;
import java.util.*;

public class BOJ_24060 {
	static int[] A, tmp;
	static int K, count = 0, result = -1;

	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		A = new int[N];
		tmp = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		/* ==========sol========== */
		mergeSort(0, N - 1);
		/* ==========output========== */
		System.out.println(result);
	}

	static void mergeSort(int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(p, q);
			mergeSort(q + 1, r);
			merge(p, q, r);
		}
	}

	static void merge(int p, int q, int r) {
		int i = p, j = q + 1, t = 0;
		while (i <= q && j <= r) {
			if (A[i] <= A[j]) tmp[t++] = A[i++];
			else tmp[t++] = A[j++];
		}
		while (i <= q) tmp[t++] = A[i++];
		while (j <= r) tmp[t++] = A[j++];
		i = p; t = 0;
		while (i <= r) {
			A[i++] = tmp[t++];
			if (++count == K) {
				result = A[i - 1];
			}
		}
	}
}
