// greedy_boj_2847_JJC

import java.util.*;

public class greedy_boj_2847_JJC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] level = new Integer[n];
		for (int i = n-1; i >= 0; i--) {
			level[i] = sc.nextInt();
		}
		int result=0;
		for(int i=1;i<n;i++){
			if(level[i]>=level[i-1]){
				result+=level[i]-level[i-1]+1;
				level[i]=level[i-1]-1;
			}
		}
		System.out.println(result);
		
		sc.close();
	}
}
