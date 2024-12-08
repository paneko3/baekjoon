// BOJ__

import java.io.*;
import java.util.*;

public class BOJ_29807 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[5];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int A = 0;
		int B = 0;
		int C = 0;
		if(arr[0]>arr[2]) {
			A = (arr[0]-arr[2])*508;
		}else {
			A = (arr[2]-arr[0])*108;
		}
		if(arr[1]>arr[3]) {
			B = (arr[1]-arr[3])*212;
		}else {
			B = (arr[3]-arr[1])*305;
		}
		C=arr[4]*707;
		System.out.println((A+B+C)*4763);
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
