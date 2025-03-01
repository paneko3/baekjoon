// BOJ_26040_특정 대문자를 소문자로 바꾸기

import java.io.*;

public class BOJ_26040 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		/* ==========sol========== */
		String result = "";
		for(int i=0;i<A.length();i++) {
			char c = A.charAt(i);
			boolean check = false;
			for(int j=0;j<B.length();j++) {
				if(c==B.charAt(j)) {
					check=true;
					break;
				}
			}
			if(check) {
				result+= (char)(c+32);
			}else {
				result+=c;
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
