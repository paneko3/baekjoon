// BOJ_14647_준오는 조류혐오야!!

import java.io.*;
import java.util.*;

public class BOJ_14647 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[][] arr = new String[n][m];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				arr[i][j]=st.nextToken();
			}
		}
		/* ==========sol========== */
		int all = 0;
		int max = 0;
		for(int i=0;i<n;i++) {
			int count = 0;
			for(int j=0;j<m;j++) {
				for(int k=0;k<arr[i][j].length();k++) {
					if(arr[i][j].charAt(k)=='9') {
						count++;
						all++;
					}
				}
			}
			max=Math.max(max, count);
		}
		for(int i=0;i<m;i++) {
			int count = 0;
			for(int j=0;j<n;j++) {
				for(int k=0;k<arr[j][i].length();k++) {
					if(arr[j][i].charAt(k)=='9') {
						count++;
					}
				}
			}
			max=Math.max(max, count);
		}
		/* ==========output========== */
		System.out.println(all-max);
		br.close();
	}
}
