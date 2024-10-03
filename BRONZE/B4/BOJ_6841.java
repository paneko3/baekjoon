// BOJ_6841_I Speak TXTMSG

import java.io.*;

public class BOJ_6841 {
	static String[] arr1 = {"CU",":-)",":-(",";-)",":-P","(~.~)","TA","CCC","CUZ","TY","YW","TTYL"};
	static String[] arr2 = {"see you","I’m happy","I’m unhappy","wink","stick out my tongue","sleepy","totally awesome","	Canadian Computing Competition","because","thank-you","you’re welcome","talk to you later"};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		while(true) {
			/* ==========input========== */
			String str = br.readLine();
			/* ==========sol========== */
			boolean flag = false;
			for(int i=0;i<12;i++) {
				if(arr1[i].equals(str)) {
					sb.append(arr2[i]);
					flag=true;
					break;
				}
			}
			/* ==========output========== */
			if(!flag) {
				sb.append(str);
			}
			sb.append("\n");
			if(str.equals("TTYL")) {
				break;
			}
		}
		System.out.println(sb);
		br.close();
	}
}
