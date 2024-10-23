// BOJ_16769_Mixing Milk

import java.io.*;
import java.util.*;

public class BOJ_16769 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int c1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int c2 = Integer.parseInt(st.nextToken());
		int m2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int c3 = Integer.parseInt(st.nextToken());
		int m3 = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		for(int i=0;i<100;i++) {
			if(i%3==0) {
				int temp = (c2<=(m2+m1)?m2+m1-c2:0);
				m2=m2+m1-temp;
				m1=temp;
			}else if(i%3==1) {
				int temp = c3<=(m3+m2)?m3+m2-c3:0;
				m3=m3+m2-temp;
				m2=temp;
			}else {
				int temp = c1<=(m1+m3)?m1+m3-c1:0;
				m1=m1+m3-temp;
				m3=temp;
			}
		}
		/* ==========output========== */
		System.out.println(m1 + " " + m2 + " " + m3);
		br.close();
	}
}
