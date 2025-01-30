// BOJ_14648_쿼리 맛보기

import java.io.*;
import java.util.*;

public class BOJ_14648 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		long[] arr = new long[n+1];
		st = new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		/* ==========sol========== */
		/* ==========output========== */
		for(int i=1;i<=q;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(x==1) {
				long result = 0;
				for(int j=a;j<=b;j++) {
					result+=arr[j];
				}
				System.out.println(result);
				long temp = arr[a];
				arr[a]=arr[b];
				arr[b]=temp;
				continue;
			}else {
				int c = Integer.parseInt(st.nextToken());
				int d = Integer.parseInt(st.nextToken());
				long result = 0;
				for(int j=a;j<=b;j++) {
					result+=arr[j];
				}
				for(int j=c;j<=d;j++) {
					result-=arr[j];
				}
				System.out.println(result);
			}
		}
		br.close();
	}
}
