// BOJ_4378_트ㅏㅊ;

import java.io.*;

public class BOJ_4378 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/* ==========sol========== */
		String keyboard1 = "`1234567890-=";
	    String keyboard2 = "QWERTYUIOP[]\\";
	    String keyboard3 = "ASDFGHJKL;'";
	    String keyboard4 = "ZXCVBNM,./";
	    String[] keyboards = {keyboard1, keyboard2, keyboard3, keyboard4};
		/* ==========output========== */
		String str;
	    while((str=br.readLine())!=null) {
	    	Loop:for(int k=0;k<str.length();k++) {
				if(str.charAt(k)==' ') {
					System.out.print(" ");
					continue Loop;
				}
				for(int i=0;i<4;i++) {
					for(int j=0;j<keyboards[i].length();j++) {
						if(str.charAt(k)==keyboards[i].charAt(j)) {
							System.out.print(keyboards[i].charAt(j-1));
							continue Loop;
						}
					}
				}
			}
	    	System.out.println();
	    }
		br.close();
	}
}
