// BOJ_2993_세 부분

import java.io.*;
import java.util.PriorityQueue;

public class BOJ_2993 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		/* ==========sol========== */
		PriorityQueue<String> queue = new PriorityQueue<String>();
		for(int i=1;i<str.length()-1;i++) {
			for(int j=i+1;j<str.length();j++) {
				String temp = "";
				for(int k=i-1;k>=0;k--) {
					temp+=str.charAt(k);
				}
				for(int k=j-1;k>=i;k--) {
					temp+=str.charAt(k);
				}
				for(int k=str.length()-1;k>=j;k--) {
					temp+=str.charAt(k);
				}
				queue.add(temp);
			}
		}
		/* ==========output========== */
		System.out.println(queue.peek());
		br.close();
	}
}
