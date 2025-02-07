// BOJ_31628_가지 한 두름 주세요

import java.io.*;
import java.util.*;

public class BOJ_31628 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String[][] map = new String[10][10];
		for(int i=0;i<10;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<10;j++) {
				map[i][j]=st.nextToken();
			}
		}
		/* ==========sol========== */
		Loop1:for(int i=0;i<10;i++) {
			String s = map[i][0];
			for(int j=0;j<10;j++) {
				if(!s.equals(map[i][j])) {
					continue Loop1;
				}
			}
			System.out.println(1);
			return;
		}
		Loop2:for(int i=0;i<10;i++) {
			String s = map[0][i];
			for(int j=0;j<10;j++) {
				if(!s.equals(map[j][i])) {
					continue Loop2;
				}
			}
			System.out.println(1);
			return;
		}
		/* ==========output========== */
		System.out.println(0);
		br.close();
	}
}
