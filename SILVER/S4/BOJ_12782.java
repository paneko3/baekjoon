// BOJ_12782_비트 우정지수

import java.io.*;
import java.util.*;

public class BOJ_12782 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int t=0;t<T;t++) {
			st = new StringTokenizer(br.readLine());
			String N = st.nextToken();
			String M = st.nextToken();
			int[] arr1 = new int[N.length()];
			int[] arr2 = new int[M.length()];
			int result = 0;
			int count = 0;
			for(int i=0;i<N.length();i++) {
				if(N.charAt(i)=='1') {
					count++;
				}
				if(M.charAt(i)=='1') {
					count--;
				}
				arr1[i]=N.charAt(i)-'0';
				arr2[i]=M.charAt(i)-'0';
			}
			count=count>0?count:-count;
			result+=count;
			for(int i=0;i<N.length();i++) {
				if(count==0) {
					break;
				}
				if(arr1[i]!=arr2[i]) {
					arr1[i]=arr1[i]==1?0:1;
					count--;
				}
			}
			int temp = 0;
			for(int i=0;i<N.length();i++) {
				if(arr1[i]!=arr2[i]) {
					temp++;
				}
			}
			result+=temp/2;
			System.out.println(result);
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
