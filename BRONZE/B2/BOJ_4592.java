// BOJ_4592_중복을 없애자

import java.io.*;
import java.util.*;

public class BOJ_4592 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			/* ==========input========== */
			String str = br.readLine();
			if(str.equals("0")) {
				break;
			}
			StringTokenizer st = new StringTokenizer(str);
			int N = Integer.parseInt(st.nextToken());
			/* ==========sol========== */
			/* ==========output========== */
			String temp = " ";
			for(int i=0;i<N;i++) {
				String s = st.nextToken();
				if(s.equals(temp)) {
					continue;
				}
				System.out.print(s + " ");
				temp = new String(s);
			}
			System.out.println("$");
		}
		br.close();
	}
}
