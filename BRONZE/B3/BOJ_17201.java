// BOJ_17201_자석 체인

import java.io.*;

public class BOJ_17201 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		/* ==========sol========== */
		boolean flag = false;
		for(int i=0;i<2*N-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				flag = true;
				break;
			}
		}
		/* ==========output========== */
		System.out.println(flag?"No":"Yes");
		br.close();
	}
}
