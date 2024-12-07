// BOJ_9226_도깨비말

import java.io.*;

public class BOJ_9226 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			/* ==========input========== */
			String str = br.readLine();
			/* ==========sol========== */
			if(str.equals("#")) {
				break;
			}
			String result = "";
			String temp = "";
			boolean flag = false;
			for(int i=0;i<str.length();i++) {
				char c = str.charAt(i);
				if(flag) {
					result+=c;
				}else {
					if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
						flag = true;
						result+=c;
					}else {
						temp+=c;
					}
				}
			}
			result+=temp+"ay";
			/* ==========output========== */
			System.out.println(result);
		}
		br.close();
	}
}
