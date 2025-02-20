// BOJ_20438_출석체크

import java.io.*;
import java.util.*;

public class BOJ_20438 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		HashSet<Integer> set = new HashSet<Integer>();
		boolean[] check = new boolean[N+3];
		boolean[] sleep = new boolean[N+3];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<K;i++) {
			sleep[Integer.parseInt(st.nextToken())]=true;
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<Q;i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		for(int num : set) {
			if(sleep[num]) {
				continue;
			}
			for(int i=num;i<=N+2;i+=num) {
				check[i]=(!sleep[i]?true:false);
			}
		}
		int[] sum = new int[N+3];
		for(int i=3;i<=N+2;i++) {
			sum[i]=sum[i-1]+(!check[i]?1:0);
		}
		/* ==========output========== */
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			System.out.println(sum[E]-sum[S-1]);
		}
		br.close();
	}
}
