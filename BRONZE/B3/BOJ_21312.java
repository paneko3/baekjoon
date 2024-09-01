// BOJ_21312_홀짝 칵테일

import java.io.*;
import java.util.*;

public class BOJ_21312 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int result = A;
		result = check(result, B);
		result = check(result, C);
		result = check(result, A*B);
		result = check(result, A*C);
		result = check(result, B*C);
		result = check(result, A*B*C);
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
	static int check(int a, int b) {
		if(a%2==1&&b%2==0) {
			return a;
		}else if(a%2==0&&b%2==1) {
			return b;
		}else {
			return a>b?a:b;
		}
	}
}
