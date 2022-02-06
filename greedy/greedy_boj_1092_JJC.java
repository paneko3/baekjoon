// greedy_boj_1092_JJC

import java.util.*;

public class greedy_boj_1092_JJC {
	static void remove(int[] cranes, int[] weight) {
		int result = 0;
		int wIndex = weight.length - 1;

		loop: while (true) {
			if(cranes[cranes.length-1]<weight[weight.length-1]){
				result=-1;
				break;
			}
			for (int i = cranes.length - 1; i >= 0; i--) {
				for (int j = weight.length - 1; j >= 0; j--) {
					if (weight[j] != -1) {
						if (cranes[i] >= weight[j]) {
							if(i==cranes.length-1){
								result++;
							}
							wIndex--;
							System.out.println(cranes[i] + " : " + weight[j]);

							weight[j]=-1;
							break;
						}
					}
					if (wIndex == -1) {
						break loop;
					}
				}
			}
		}

		System.out.println(result);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] cranes = new int[n];
		for (int i = 0; i < n; i++) {
			cranes[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int[] weight = new int[m];
		for (int i = 0; i < m; i++) {
			weight[i] = sc.nextInt();
		}

		Arrays.sort(cranes);
		Arrays.sort(weight);

		remove(cranes, weight);

		sc.close();
	}
}
