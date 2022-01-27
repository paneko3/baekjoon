// greedy_boj_1758_JJC

import java.util.*;

public class greedy_boj_1758_JJC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] tip = new Integer[n];
		for(int i=0;i<n;i++){
			tip[i]= sc.nextInt();
		}
		Arrays.sort(tip, Collections.reverseOrder());
		long result=0;
		int temp=0;
		for(int i=0;i<n;i++){
			temp=tip[i]-i;
			if(temp>0){
				result+=temp;
			}
		}
		System.out.println(result);

		sc.close();
	}
}
