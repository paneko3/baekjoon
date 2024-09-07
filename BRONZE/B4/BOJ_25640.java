// BOJ_25640_MBTI

import java.io.*;

public class BOJ_25640 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int result = 0;
		for(int i=0;i<N;i++) {
			if(str.equals(br.readLine())) {
				result++;
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
