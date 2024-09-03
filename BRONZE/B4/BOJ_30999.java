// BOJ_30999_민주주의

import java.io.*;
import java.util.*;

public class BOJ_30999 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int result = 0;
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			int count = 0;
			for(int j=0;j<M;j++) {
				count+=str.charAt(j)=='O'?1:0;
			}
			result+=count>M/2?1:0;
		}
		System.out.println(result);
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
