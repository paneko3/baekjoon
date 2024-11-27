// BOJ_21919_소수 최소 공배수

import java.io.*;
import java.util.*;

public class BOJ_21919 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		HashSet<Integer> set = new HashSet<Integer>();
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		/* ==========sol========== */
		boolean[] arr = new boolean[1000001];
		arr[1]=true;
		for(int i=2;i<Math.sqrt(1000001);i++) {
			if(!arr[i]) {
				for(int j=i*i;j<1000001;j+=i) {
					arr[j]=true;
				}
			}
		}
		long result = 1;
		for(int n : set) {
			if(!arr[n]) {
				result*=n;
			}
		}
		/* ==========output========== */
		System.out.println(result==1?-1:result);
		br.close();
	}
}
