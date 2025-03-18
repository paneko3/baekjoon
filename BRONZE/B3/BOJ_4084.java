// BOJ_4084_Viva la Diferencia

import java.io.*;
import java.util.*;

public class BOJ_4084 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			/* ==========input========== */
			st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			long c = Long.parseLong(st.nextToken());
			long d = Long.parseLong(st.nextToken());
			/* ==========sol========== */
			if(a==0&&b==0&&c==0&&d==0) {
				break;
			}
			int result = 0;
			while(true) {
				if(a==b&&b==c&&c==d) {
					break;
				}
				result++;
				long tempA = Math.abs(a-b);
				long tempB = Math.abs(b-c);
				long tempC = Math.abs(c-d);
				long tempD = Math.abs(d-a);
				a=tempA;
				b=tempB;
				c=tempC;
				d=tempD;
			}
			/* ==========output========== */
			System.out.println(result);
		}
		br.close();
	}
}
