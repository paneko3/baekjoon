// BOJ_27918_탁구 경기

import java.io.*;

public class BOJ_27918 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int d = 0;
		int p = 0;
		for(int i=0;i<N;i++) {
			if(br.readLine().charAt(0)=='D') {
				d++;
			}else {
				p++;
			}
			if(Math.abs(d-p)>=2) {
				System.out.println(d + ":" + p);
				return;
			}
		}
		/* ==========output========== */
		System.out.println(d + ":" + p);
		br.close();
	}
}
