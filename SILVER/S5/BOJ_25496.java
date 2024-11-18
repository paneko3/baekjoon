// BOJ_25496_장신구 명장 임스

import java.io.*;
import java.util.*;

public class BOJ_25496 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int P = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int result = 0;
		for(int i=0;i<N;i++) {
			if(P>=200) {
				break;
			}
			result++;
			P+=arr[i];
		}
		System.out.println(result);
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
