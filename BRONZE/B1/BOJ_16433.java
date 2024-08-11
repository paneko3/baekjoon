// BOJ_16433_주디와 당근농장

import java.io.*;
import java.util.*;

public class BOJ_16433 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		StringBuilder sb = new StringBuilder();
		if((R+C)%2==1) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					sb.append((i+j)%2==1?"v":".");
					
				}
				sb.append("\n");
			}
		}else {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					sb.append((i+j)%2==0?"v":".");
					
				}
				sb.append("\n");
			}
		}
		/* ==========output========== */
		System.out.println(sb);
		br.close();
	}
}
