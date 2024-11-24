// BOJ_1706_크로스워드

import java.io.*;
import java.util.*;

public class BOJ_1706 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		char[][] arr = new char[N][C];
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			for(int j=0;j<C;j++) {
				arr[i][j]=str.charAt(j);
			}
		}
		/* ==========sol========== */
		PriorityQueue<String> queue = new PriorityQueue<String>();
		for(int i=0;i<N;i++) {
			String temp = "";
			for(int j=0;j<C;j++) {
				if(arr[i][j]=='#') {
					if(temp.length()>=2) {
						queue.add(temp);
					}
					temp = "";
				}else {
					temp+=arr[i][j];
				}
			}
			if(temp.length()>=2) {
				queue.add(temp);
			}
		}
		for(int i=0;i<C;i++) {
			String temp = "";
			for(int j=0;j<N;j++) {
				if(arr[j][i]=='#') {
					if(temp.length()>=2) {
						queue.add(temp);
					}
					temp = "";
				}else {
					temp+=arr[j][i];
				}
			}
			if(temp.length()>=2) {
				queue.add(temp);
			}
		}
		/* ==========output========== */
		System.out.println(queue.poll());
		br.close();
	}
}
