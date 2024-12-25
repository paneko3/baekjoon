// BOJ_16503_괄호 없는 사칙연산

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_16503 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K1= Integer.parseInt(st.nextToken());
		String O1 = st.nextToken();
		int K2= Integer.parseInt(st.nextToken());
		String O2 = st.nextToken();
		int K3= Integer.parseInt(st.nextToken());
		int result1 = cal(cal(K1,O1,K2),O2,K3);
		int result2 = cal(K1,O1,cal(K2,O2,K3));
		if(result1<result2) {
			System.out.println(result1);
			System.out.println(result2);
		}else {
			System.out.println(result2);
			System.out.println(result1);
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
	static int cal(int a, String o, int b) {
		if(o.equals("+")) {
			return a+b;
		}else if(o.equals("-")) {
			return a-b;
		}else if(o.equals("*")) {
			return a*b;
		}else if(o.equals("/")) {
			return a/b;
		}
		return 0;
	}
}
