// BOJ_17176_암호해독기

import java.io.*;
import java.util.*;

public class BOJ_17176 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[53];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
		int[] count = new int[53];
		String str = br.readLine();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c==' ') {
				count[0]++;
			}else if(c>='A'&&c<='Z') {
				count[c-'A'+1]++;
			}else if(c>='a'&&c<='z') {
				count[c-'a'+27]++;
			}
		}
		for(int i=0;i<53;i++) {
			if(arr[i]!=count[i]) {
				System.out.println("n");
				return;
			}
		}
		System.out.println("y");
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
