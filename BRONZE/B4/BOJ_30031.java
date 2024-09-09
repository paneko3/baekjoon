// BOJ_30031_지폐 세기

import java.io.*;
import java.util.*;

public class BOJ_30031 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int result = 0;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			if(num==136) {
				result+=1000;
			}else if(num==142) {
				result+=5000;
			}else if(num==148) {
				result+=10000;
			}else if(num==154) {
				result+=50000;
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
