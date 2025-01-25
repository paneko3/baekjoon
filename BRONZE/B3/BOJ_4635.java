// BOJ_4635_Speed Limit

import java.io.*;
import java.util.*;

public class BOJ_4635 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			/* ==========input========== */
			int n = Integer.parseInt(br.readLine());
			/* ==========sol========== */
			if(n==-1) {
				break;
			}
			int result = 0;
			int temp = 0;
			for(int i=0;i<n;i++) {
				st = new StringTokenizer(br.readLine());
				int s = Integer.parseInt(st.nextToken());
				int t = Integer.parseInt(st.nextToken());
				result += s*(t-temp);
				temp=t;
			}
			/* ==========output========== */
			System.out.println(result + " miles");
		}
		br.close();
	}
}
