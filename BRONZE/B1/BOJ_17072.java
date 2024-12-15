// BOJ_17072_아스키 아트

import java.io.*;
import java.util.*;

public class BOJ_17072 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				int R = Integer.parseInt(st.nextToken());
				int G = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				int I = 2126*R + 7152*G + 722*B;
				if(I<510000) {
					sb.append("#");
				}else if(I<1020000) {
					sb.append("o");
				}else if(I<1530000) {
					sb.append("+");
				}else if(I<2040000) {
					sb.append("-");
				}else {
					sb.append(".");
				}
			}
			sb.append("\n");
		}
		/* ==========output========== */
		System.out.println(sb);
		br.close();
	}
}
