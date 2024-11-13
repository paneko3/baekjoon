// BOJ_26264_빅데이터? 정보보호!

import java.io.*;

public class BOJ_26264 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		String str = br.readLine();
		int result=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='b') {
				result++;
			}else if(str.charAt(i)=='s'){
				result--;
			}
		}
		/* ==========output========== */
		System.out.println(result>0?"bigdata?":(result<0?"security!":"bigdata? security!"));
		br.close();
	}
}
