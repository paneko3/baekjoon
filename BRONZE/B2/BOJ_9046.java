// BOJ_9046_복호화

import java.io.*;

public class BOJ_9046 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			/* ==========input========== */
			String str = br.readLine();
			/* ==========sol========== */
			int[] count = new int[26];
			for(int i=0;i<str.length();i++) {
				char c = str.charAt(i);
				if(c>='a'&&c<='z') {
					count[c-'a']++;
				}
			}
			int max = -1;
			char c='a';
			boolean flag = false;
			for(int i=0;i<26;i++) {
				if(count[i]==max) {
					flag=true;
				}else if(count[i]>max) {
					flag=false;
					max=count[i];
					c=(char)('a'+i);
				}
			}
			/* ==========output========== */
			System.out.println(flag?"?":c);
		}
		br.close();
	}
}
