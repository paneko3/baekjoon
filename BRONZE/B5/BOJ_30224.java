// BOJ_30224_Lucky 7

import java.io.*;

public class BOJ_30224 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		/* ==========sol========== */
		/* ==========output========== */
		if(!str.contains("7")&&n%7!=0) {
			System.out.println(0);
		}else if(!str.contains("7")&&n%7==0) {
			System.out.println(1);
		}else if(str.contains("7")&&n%7!=0) {
			System.out.println(2);
		}else if(str.contains("7")&&n%7==0) {
			System.out.println(3);
		}
		br.close();
	}
}
