// BOJ_31428_엘리스 트랙 매칭

import java.io.*;
import java.util.*;

public class BOJ_31428 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[4];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			char c = st.nextToken().charAt(0);
			if(c=='C') {
				arr[0]++;
			}else if(c=='S') {
				arr[1]++;
			}else if(c=='I') {
				arr[2]++;
			}else if(c=='A') {
				arr[3]++;
			}
		}
		char c = br.readLine().charAt(0);
		if(c=='C') {
			System.out.println(arr[0]);
		}else if(c=='S') {
			System.out.println(arr[1]);
		}else if(c=='I') {
			System.out.println(arr[2]);
		}else if(c=='A') {
			System.out.println(arr[3]);
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
