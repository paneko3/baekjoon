// BOJ_25858_Divide the Cash

import java.io.*;
import java.util.*;

public class BOJ_25858 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int[] arr = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		/* ==========output========== */
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]*d/sum);
		}
		br.close();
	}
}
