// BOJ_28290_안밖? 밖안? 계단? 역계단?

import java.io.*;

public class BOJ_28290 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		/* ==========sol========== */
		/* ==========output========== */
		if(str.equals("fdsajkl")||str.equals("jkl;fdsa")) {
			System.out.println("in-out");
		}else if(str.equals("asdf;lkj")||str.equals(";lkjasdf")) {
			System.out.println("out-in");
		}else if(str.equals("asdfjkl;")) {
			System.out.println("stairs");
		}else if(str.equals(";lkjfdsa")) {
			System.out.println("reverse");
		}else {
			System.out.println("molu");
		}
		br.close();
	}
}
 