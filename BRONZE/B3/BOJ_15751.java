// BOJ_15751_Teleportation

import java.io.*;
import java.util.*;

public class BOJ_15751 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		if(a>b) {
			int temp = a;
			a=b;
			b=temp;
		}
		if(x>y) {
			int temp = x;
			x=y;
			y=temp;
		}
		/* ==========output========== */
		System.out.println(Math.min(b-a, Math.abs(x-a)+Math.abs(y-b)));
		br.close();
	}
}
