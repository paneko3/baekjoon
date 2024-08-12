// BOJ_21918_전구

import java.io.*;
import java.util.*;

public class BOJ_21918 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		/* ==========sol========== */
		boolean[] arr = new boolean[N+1];
		st = new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(st.nextToken())==0?false:true;
		}
		for(int i=1;i<=M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a==1) {
				arr[b]=(c==0?false:true);
			}else if(a==2) {
				for(int j=b;j<=c;j++) {
					arr[j]=!arr[j];
				}
			}else if(a==3) {
				for(int j=b;j<=c;j++) {
					arr[j]=false;
				}
			}else if(a==4) {
				for(int j=b;j<=c;j++) {
					arr[j]=true;
				}
			}
		}
		/* ==========output========== */
		for(int i=1;i<=N;i++) {
			System.out.print((arr[i]?1:0) + " ");
		}
		br.close();
	}
}
