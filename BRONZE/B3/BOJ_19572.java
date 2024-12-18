// BOJ_19572_가뭄(Small)

import java.io.*;
import java.util.*;

public class BOJ_19572 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double d1 = Double.parseDouble(st.nextToken());
		double d2 = Double.parseDouble(st.nextToken());
		double d3 = Double.parseDouble(st.nextToken());
		/* ==========sol========== */
		double a = (d1+d2-d3)/2;
		double b = d1-a;
		double c = d2-a;
		/* ==========output========== */
		if(a>0&&b>0&&c>0) {
			System.out.println(1);
			System.out.printf("%.1f %.1f %.1f",a,b,c);
		}else {
			System.out.println(-1);
		}
		br.close();
	}
}
