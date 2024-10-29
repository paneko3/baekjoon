// BOJ_20205_교수님 그림이 깨지는데요?

import java.io.*;
import java.util.*;

public class BOJ_20205 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			StringBuilder temp = new StringBuilder();
			for(int j=0;j<N;j++) {
				int bit = Integer.parseInt(st.nextToken());
				for(int k=0;k<K;k++) {
					temp.append(bit).append(" ");
				}
			}
			for(int j=0;j<K;j++) {
				sb.append(temp.toString()).append("\n");
			}
		}
		/* ==========output========== */
		System.out.println(sb);
		br.close();
	}
}
