// BOJ_25629_홀짝 수열

import java.io.*;
import java.util.*;

public class BOJ_25629 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int a = 0;
		int b = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num%2!=0) {
				a++;
			}else {
				b++;
			}
		}
		/* ==========sol========== */
		/* ==========output========== */
		if(N%2==0) {
			if(a==N/2&&b==N/2) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}else {
			if(a==(N/2+1)&&b==N/2) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
		br.close();
	}
}
