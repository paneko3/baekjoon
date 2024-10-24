// BOJ_27890_특별한 작은 분수

import java.io.*;
import java.util.*;

public class BOJ_27890 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		for(int i=0;i<N;i++) {
			if(x%2==0) {
				x = (x/2)^6;
			}else {
				x = (x*2)^6;
			}
		}
		/* ==========output========== */
		System.out.println(x);
		br.close();
	}
}
