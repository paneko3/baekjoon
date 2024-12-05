// BOJ_14655_욱제는 도박쟁이야!!

import java.io.*;
import java.util.*;

public class BOJ_14655 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		st = new StringTokenizer(br.readLine());
		int result = 0;
		for(int i=0;i<N;i++) {
			result+=Math.abs(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			result+=Math.abs(Integer.parseInt(st.nextToken()));
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
