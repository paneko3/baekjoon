// BOJ_14954_Happy Number

import java.io.*;

public class BOJ_14954 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int a = cal(N);
		int b = cal(a);
		while(a!=1&&b!=1) {
			if(a==b) {
				System.out.println("UNHAPPY");
				return;
			}
			a = cal(a);
			b = cal(cal(b));
		}
		/* ==========output========== */
		System.out.println("HAPPY");
		br.close();
	}
	static int cal(int n) {
		int sum = 0;
		while(n!=0) {
			sum+=(n%10)*(n%10);
			n/=10;
		}
		return sum;
	}
}
