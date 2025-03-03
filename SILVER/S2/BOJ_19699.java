// BOJ_19699_소-난다!

import java.io.*;
import java.util.*;

public class BOJ_19699 {
	static int N,M;
	static int[] cow;
	static ArrayList<Integer> list;
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		cow = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			cow[i] = Integer.parseInt(st.nextToken());
		}
		/* ==========sol========== */
		list = new ArrayList<Integer>();
		backtrack(0, 0, 0);
        Collections.sort(list);
		/* ==========output========== */
        if(list.size()==0) {
        	System.out.println(-1);
        }else {
            for (int i : list) {
                System.out.print(i + " ");
            }
        }
		br.close();
	}
	 static void backtrack(int x, int sum, int cnt) {
	        if (cnt == M) {
	            //소수 판별
	            for (int i = 2; i <= sum / 2; i++) {
	                if (sum % i == 0) return;
	            }
	            if (!(list.contains(sum))) list.add(sum);
	        }

	        for (int i = x; i < N; i++) {
	            backtrack(i + 1, sum + cow[i], cnt + 1);
	        }
	    }
}

