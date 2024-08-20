// BOJ_5358_Football Team

import java.io.*;

public class BOJ_5358 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		/* ==========sol========== */
		/* ==========output========== */
		while((str=br.readLine())!=null) {
			String temp = "";
			for(int i=0;i<str.length();i++) {
				char c = str.charAt(i);
				if(c=='e') {
					c='i';
				}else if(c=='i') {
					c='e';
				}else if(c=='E') {
					c='I';
				}else if(c=='I') {
					c='E';
				}
				temp+=c;
			}
			System.out.println(temp);
		}
		br.close();
	}
}
