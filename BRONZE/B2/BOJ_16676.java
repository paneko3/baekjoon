// BOJ_16676_근우의 다이어리 꾸미기

import java.io.*;

public class BOJ_16676 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		/* ==========output========== */
		if(N<=10) {
			System.out.println(1);
		}else {
			int k = 2;
            for(int i=11; true; i=i*10+1) {
                if(N >= i && N <= i*10) {
                    System.out.println(k);
                    break;
                }
                k++;
            }
		}
		br.close();
	}
}
