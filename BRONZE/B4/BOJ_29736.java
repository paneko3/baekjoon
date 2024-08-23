// BOJ_29736_브실이와 친구가 되고 싶어 🤸‍♀️

import java.io.*;
import java.util.*;

public class BOJ_29736 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		/* ==========output========== */
		int result = 0;
		for(int i=A;i<=B;i++) {
			if((i>=(K-X))&&((i<=(K+X)))){
				result++;
			}
		}
		System.out.println(result!=0?result:"IMPOSSIBLE");
		/* ==========sol========== */
		br.close();
	}
}
