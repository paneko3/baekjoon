// BOJ_15905_스텔라(STELLA)가 치킨을 선물했어요

import java.io.*;
import java.util.*;

public class BOJ_15905 {
	static class Team implements Comparable<Team>{
		int count, penalty;
		public Team(int count, int penalty) {
			this.count = count;
			this.penalty = penalty;
		}
		@Override
		public int compareTo(Team o) {
			if(this.count==o.count) {
				return this.penalty - o.penalty;
			}else {
				return o.count - this.count ;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		Team[] teams = new Team[N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			teams[i]=new Team(c,p);
		}
		Arrays.sort(teams);
		int cut = teams[4].count;
		int result = 0;
		for(int i=5;i<N;i++) {
			if(teams[i].count==cut) {
				result++;
			}else {
				break;
			}
		}
		System.out.println(result);
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
