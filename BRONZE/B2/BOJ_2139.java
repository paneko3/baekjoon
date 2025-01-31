// BOJ_2139_나는 너가 살아온 날을 알고 있다

import java.io.*;
import java.util.*;

public class BOJ_2139 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			/* ==========input========== */
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			/* ==========sol========== */
			if(d==0&&m==0&&y==0) {
				break;
			}
			int result = 0;
			for(int i=1;i<m;i++) {
				if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) {
					result+=31;
				}else {
					if(i==2) {
						result+=28;
						if(y%400==0) {
							result++;
						}else {
							if(y%100!=0&&y%4==0) {
								result++;
							}
						}
					}else {
						result+=30;
					}
				}
			}
			result+=d;
			/* ==========output========== */
			System.out.println(result);
		}
		br.close();
	}
}
