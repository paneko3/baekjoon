// BOJ_25881_Electric Bill

import java.io.*;
import java.util.*;

public class BOJ_25881 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			/* ==========input========== */
			int num = Integer.parseInt(br.readLine());
			/* ==========sol========== */
			int result = num>1000?1000*a+(num-1000)*b:num*a;
			/* ==========output========== */
			System.out.println(num + " " + result);
		}
		br.close();
	}
}
