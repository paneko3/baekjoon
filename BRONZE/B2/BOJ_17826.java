// BOJ_17826_나의 학점은?

import java.io.*;
import java.util.*;

public class BOJ_17826 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[51];
		for(int i=1;i<=50;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int num = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		for(int i=1;i<=50;i++) {
			if(arr[i]<=num) {
				if (i<=5) System.out.println("A+");
		        else if (i<=15) System.out.println("A0");
		        else if (i<=30) System.out.println("B+");
		        else if (i<=35) System.out.println("B0");
		        else if (i<=45) System.out.println("C+");
		        else if (i<=48) System.out.println("C0");
		        else System.out.println("F");
				break;
			}
		}
		br.close();
	}
}
