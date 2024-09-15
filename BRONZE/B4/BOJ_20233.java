// BOJ_20233_Bicycle

import java.io.*;

public class BOJ_20233 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int x = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int T = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		int result1 = (T>=30?(T-30)*x:0)*21+a;
		int result2 = (T>=45?(T-45)*y:0)*21+b;
		/* ==========output========== */
		System.out.println(result1 + " " + result2);
		br.close();
	}
}
