// BOJ_25965_미션 도네이션

import java.io.*;
import java.util.*;

public class BOJ_25965 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			/* ==========input========== */
			int M = Integer.parseInt(br.readLine());
			int[][] KDA = new int[M][3];
			for(int j=0;j<M;j++) {
				st = new StringTokenizer(br.readLine());
				KDA[j][0]=Integer.parseInt(st.nextToken());
				KDA[j][1]=Integer.parseInt(st.nextToken());
				KDA[j][2]=Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			/* ==========sol========== */
			int result = 0;
			for(int j=0;j<M;j++) {
				int sum = 0;
				sum += KDA[j][0]*k;
				sum -= KDA[j][1]*d;
				sum += KDA[j][2]*a;
				result+=Math.max(sum, 0);
			}
			/* ==========output========== */
			System.out.println(result);
		}
		
		br.close();
	}
}
