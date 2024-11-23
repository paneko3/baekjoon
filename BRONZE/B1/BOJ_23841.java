// BOJ_23841_데칼코마니

import java.io.*;
import java.util.*;

public class BOJ_23841 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			for(int j=0;j<M/2;j++) {
				System.out.print(str.charAt(M-1-j)=='.'?str.charAt(j):str.charAt(M-1-j));
			}
			for(int j=M/2;j<M;j++) {
				System.out.print(str.charAt(M-1-j)=='.'?str.charAt(j):str.charAt(M-1-j));
			}
			System.out.println();
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
