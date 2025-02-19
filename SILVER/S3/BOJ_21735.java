// BOJ_21735_눈덩이 굴리기

import java.io.*;
import java.util.*;

public class BOJ_21735 {
	static int N, M, result;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N+1];
		st = new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		/* ==========sol========== */
		result = 0;
		move(0,0,1);
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
	static void move(int t, int p, int size) {
		if(t==M||p>=N) {
			result = Math.max(result, size);
			return;
		}
		if(p+1<=N) {
			move(t+1,p+1,size+arr[p+1]);
		}
		if(p+2<=N) {
			move(t+1,p+2,size/2+arr[p+2]);
		}
	}
}
