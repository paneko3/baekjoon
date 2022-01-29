// greedy_boj_1931_JJC

import java.util.*;

class Hall implements Comparable<Hall> {
	int start = 0;
	int end = 0;

	public int compareTo(Hall h) {
		if ((this.end) > (h.end)) {
			return 1;
		} else if ((this.end) == (h.end)) {
			if (this.start > h.start) {
				return 1;
			} else if (this.start == h.start) {
				return 0;
			} else {
				return -1;
			}
		} else {
			return -1;
		}

	}
}

public class greedy_boj_1931_JJC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Hall[] time = new Hall[n];
		for (int i = 0; i < n; i++) {
			time[i] = new Hall();
			time[i].start = sc.nextInt();
			time[i].end = sc.nextInt();
		}
		Arrays.sort(time);

		int result = 0;
		int s = 0;
		for(int i = 0;i<n;i++){
			if(time[i].start >= s){
				s=time[i].end;
				result++;
			}
		}
		
		System.out.println(result);


		sc.close();
	}
}
