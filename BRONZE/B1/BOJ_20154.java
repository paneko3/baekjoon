// BOJ_20154_이 구역의 승자는 누구야?!

import java.io.*;

public class BOJ_20154 {
	static int[] arr = {3,2,1,2,3,3,3,3,1,1,3,1,3,3,1,2,2,2,1,2,1,1,2,2,2,1};
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		/* ==========sol========== */
		int result = 0;
		for(int i=0;i<str.length();i++) {
			result+=arr[str.charAt(i)-'A'];
			result%=10;
		}
		/* ==========output========== */
		System.out.println(result%2==1?"I'm a winner!":"You're the winner?");
		br.close();
	}
}
