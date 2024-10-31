// BOJ_23810_골뱅이 찍기 - 뒤집힌 ㅋ

import java.io.*;

public class BOJ_23810 {
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		sb = new StringBuilder();
		paint(N,"@@@@@");
		paint(N,"@");
		paint(N,"@@@@@");
		paint(N,"@");
		paint(N,"@");
		/* ==========output========== */
		System.out.println(sb);
		br.close();
	}
	static void paint(int n, String str) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sb.append(str);
			}
			sb.append("\n");
		}
	}
}
