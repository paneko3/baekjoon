// BOJ_25642_젓가락 게임

import java.io.*;
import java.util.*;

public class BOJ_25642 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		/* ==========output========== */
		while(true) {
			B+=A;
			if(B>=5) {
				System.out.println("yt");
				break;
			}
			A+=B;
			if(A>=5) {
				System.out.println("yj");
				break;
			}
		}
		br.close();
	}
}
