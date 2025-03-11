// BOJ_25932_Find the Twins

import java.io.*;
import java.util.*;

public class BOJ_25932 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			/* ==========sol========== */
			boolean m = false;
			boolean z = false;
			for(int j=0;j<10;j++) {
				int num = Integer.parseInt(st.nextToken());
				System.out.print(num+ (i!=n-1?" ":""));
				if(num==18) {
					m=true;
				}
				if(num==17) {
					z=true;
				}
			}
			/* ==========output========== */
			System.out.println();
			if(m&&z) {
				System.out.println("both");
			}else if(m) {
				System.out.println("mack");
			}else if(z) {
				System.out.println("zack");
			}else {
				System.out.println("none");
			}
			System.out.println();
		}
		br.close();
	}
}
