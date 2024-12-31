// BOJ_23809_골뱅이 찍기 - 돌아간 ㅈ

import java.io.*;

public class BOJ_23809 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		StringBuilder sb = new StringBuilder();
        print(N, sb, 3);
        print(N, sb, 2);
        print(N, sb, 0);
        print(N, sb, 2);
        print(N, sb, 3);
		/* ==========output========== */
        System.out.println(sb);
		br.close();
	}
	static void print(int n, StringBuilder sb, int gap) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append('@');
            }
            for (int j = 0; j < gap*n; j++) {
                sb.append(' ');
            }
            for (int j = 0; j < n; j++) {
                sb.append('@');
            }
            if (gap == 0) {
                for (int j = 0; j < n; j++) {
                    sb.append('@');
                }
            }
            sb.append('\n');
        }
    }
}
