// BOJ_12840_창용이의 시계

import java.io.*;
import java.util.*;

public class BOJ_12840 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int time = h*3600+m*60+s;
		int q = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		for(int i=0;i<q;i++) {
			st = new StringTokenizer(br.readLine());
			int T = Integer.parseInt(st.nextToken());
			if(T==1) {
				int c = Integer.parseInt(st.nextToken());
				time=(time+c)%86400;
			}else if(T==2) {
				int c = Integer.parseInt(st.nextToken());
				time=((time-c)%86400)<0?(time-c)%86400+86400:(time-c)%86400;
			}else {
				System.out.println(time/3600 + " " + ((time/60)%60) + " " + time%60);
			}
		}
		br.close();
	}
}
