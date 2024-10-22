// BOJ_25784_Easy-to-Solve Expressions

import java.io.*;
import java.util.*;

public class BOJ_25784 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		/* ==========output========== */
		if((a+b==c)||(b+c==a)||(a+c==b)) {
			System.out.println(1);
		}else if((a*b==c)||(b*c==a)||(a*c==b)) {
			System.out.println(2);
		}else {
			System.out.println(3);
		}
		br.close();
	}
}
