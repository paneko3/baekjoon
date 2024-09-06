// BOJ_3181_줄임말 만들기

import java.io.*;

public class BOJ_3181 {
	static String[] arr = {"i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"};
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		/* ==========sol========== */
		String result = "";
		Loop:for(int i=0;i<str.length;i++) {
			for(int j=0;j<10;j++) {
				if(str[i].equals(arr[j])&&i!=0){
					continue Loop;
				}
			}
			result += str[i].toUpperCase().charAt(0);
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
