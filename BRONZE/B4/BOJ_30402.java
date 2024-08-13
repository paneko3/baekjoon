// BOJ_30402_감마선을 맞은 컴퓨터

import java.io.*;
import java.util.*;

public class BOJ_30402 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		/* ==========sol========== */
		/* ==========output========== */
		for(int i=0;i<15;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<15;j++) {
				char c = st.nextToken().charAt(0);
				if(c=='w') {
					System.out.println("chunbae");
					return;
				}else if(c=='b') {
					System.out.println("nabi");
					return;
				}else if(c=='g') {
					System.out.println("yeongcheol");
					return;
				}
			}
		}
		br.close();
	}
}
