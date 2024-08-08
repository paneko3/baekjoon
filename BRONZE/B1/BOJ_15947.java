// BOJ_15947_아기 석환 뚜루루 뚜루

import java.io.*;
import java.util.*;

public class BOJ_15947 {
	static String[] arr = {"baby", "sukhwan", "tururu", "turu", "very", "cute", "tururu", "turu", "in", "bed", "tururu", "turu", "baby", "sukhwan"}; 
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine())-1;
		/* ==========sol========== */
		/* ==========output========== */
		if(N%14==2||N%14==6||N%14==10) {
			if(N/14>=3) {
				System.out.print("tu+ru*"+(N/14+2));
			}else {
				System.out.print("tu");
				for(int i=0;i<=(N/14+1);i++) {
					System.out.print("ru");
				}
			}
		}else if(N%14==3||N%14==7||N%14==11) {
			if(N/14>=4) {
				System.out.print("tu+ru*"+(N/14+1));
			}else {
				System.out.print("tu");
				for(int i=0;i<=N/14;i++) {
					System.out.print("ru");
				}
			}
			
		}else {
			System.out.println(arr[N%14]);
		}
		br.close();
	}
}
