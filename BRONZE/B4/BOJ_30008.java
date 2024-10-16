// BOJ_30008_준영이의 등급

import java.io.*;
import java.util.*;

public class BOJ_30008 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<K;i++) {
			int P = 100*Integer.parseInt(st.nextToken())/N;
			if(P<=4) {
				System.out.print(1+" ");
			}else if(P<=11) {
				System.out.print(2+" ");
			}else if(P<=23) {
				System.out.print(3+" ");
			}else if(P<=40) {
				System.out.print(4+" ");
			}else if(P<=60) {
				System.out.print(5+" ");
			}else if(P<=77) {
				System.out.print(6+" ");
			}else if(P<=89) {
				System.out.print(7+" ");
			}else if(P<=96) {
				System.out.print(8+" ");
			}else if(P<=100) {
				System.out.print(9+" ");
			}
		}
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
