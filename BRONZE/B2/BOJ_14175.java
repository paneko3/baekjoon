// BOJ_14175_The Cow-Signal

import java.io.*;
import java.util.*;

public class BOJ_14175 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		char[][] arr = new char[M][N];
		for(int i=0;i<M;i++) {
			String str = br.readLine();
			for(int j=0;j<N;j++) {
				arr[i][j]=str.charAt(j);
			}
		}
		for(int i=0;i<M;i++) {
			for(int k=0;k<K;k++) {
				for(int j=0;j<N;j++) {
					for(int l=0;l<K;l++) {
						System.out.print(arr[i][j]);
					}
				}
				System.out.println();
			}
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
