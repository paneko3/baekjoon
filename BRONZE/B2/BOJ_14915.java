// BOJ_14915_진수 변환기

import java.io.*;
import java.util.*;

public class BOJ_14915 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		if(m==0) {
			System.out.println(0);
			return;
		}
		Stack<Character> stack = new Stack<Character>();
		while(m!=0) {
			int temp = m%n;
			if(temp>9) {
				stack.add((char)(temp+'A'-10));
			}else {
				stack.add((char)(temp+'0'));
			}
			m/=n;
		}
		/* ==========output========== */
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		br.close();
	}
}
