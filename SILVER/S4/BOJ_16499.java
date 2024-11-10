// BOJ_16499_동일한 단어 그룹화하기

import java.io.*;
import java.util.*;

public class BOJ_16499 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		HashSet<String> list = new HashSet<String>();
		for(int i=0;i<N;i++) {
			char[] arr = br.readLine().toCharArray();
			Arrays.sort(arr);
			String str = "";
			for(char c : arr) {
				str+=c;
			}
			list.add(str);
		}
		/* ==========output========== */
		System.out.println(list.size());
		br.close();
	}
}
