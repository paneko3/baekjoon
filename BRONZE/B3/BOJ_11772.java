// BOJ_11772_POT

import java.io.*;

public class BOJ_11772 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		long result = 0;
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			long number = Long.parseLong(str.substring(0,str.length()-1));
			int pot = Integer.parseInt(str.substring(str.length()-1,str.length()));
			result += Math.pow(number, pot);
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
