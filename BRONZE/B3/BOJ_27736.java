// BOJ_27736_찬반투표

import java.io.*;
import java.util.*;

public class BOJ_27736 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		int[] arr = new int[3];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num==1) {
				arr[0]++;
			}else if(num==-1) {
				arr[1]++;
			}else {
				arr[2]++;
			}
		}
		/* ==========output========== */
		if(arr[2]>((N%2!=0?(N/2)+1:N/2)/2)) {
			System.out.println("INVALID");
		}else if(arr[0]>arr[1]) {
			System.out.println("APPROVED");
		}else {
			System.out.println("REJECTED");
		}
		br.close();
	}
}
