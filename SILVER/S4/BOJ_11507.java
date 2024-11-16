// BOJ_11507_카드셋트

import java.io.*;
import java.util.ArrayList;

public class BOJ_11507 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();		
		/* ==========sol========== */
		int[] count = new int[4];
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<S.length();i+=3) {
			String temp = S.substring(i,i+3);
			if(temp.charAt(0)=='P') {
				count[0]++;
			}else if(temp.charAt(0)=='K') {
				count[1]++;
			}else if(temp.charAt(0)=='H') {
				count[2]++;
			}else if(temp.charAt(0)=='T') {
				count[3]++;
			}
			if(list.contains(temp)) {
				System.out.println("GRESKA");
				return;
			}
			list.add(temp);
		}
		/* ==========output========== */
		System.out.println((13-count[0]) + " " + (13-count[1]) + " " +(13-count[2]) + " " +(13-count[3]));
		br.close();
	}
}
