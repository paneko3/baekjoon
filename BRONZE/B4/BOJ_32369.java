// BOJ_32369_양파 실험

import java.io.*;
import java.util.*;

public class BOJ_32369 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int good = 1;
		int bad = 1;
		for(int i=0;i<N;i++) {
			good+=A;
			bad+=B;
			if(bad>good) {
				int temp = good;
				good = bad;
				bad = temp;
			}else if(bad==good) {
				bad--;
			}
		}
		/* ==========output========== */
		System.out.println(good + " " + bad);
		br.close();
	}
}
