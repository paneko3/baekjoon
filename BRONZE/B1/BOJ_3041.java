// BOJ_3041_N-퍼즐 

import java.io.*;

public class BOJ_3041 {
	static char[][] arr = {{'A','B','C','D'},{'E','F','G','H'},{'I','J','K','L'},{'M','N','O','.'}};
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;
		/* ==========sol========== */
		for(int i=0;i<4;i++) {
			String str = br.readLine();
			for(int j=0;j<4;j++) {
				char c = str.charAt(j);
				for(int a=0;a<4;a++) {
					for(int b=0;b<4;b++) {
						if(c!='.'&&c==arr[a][b]) {
							result += Math.abs(i-a)+Math.abs(j-b);
						}
					}
				}
			}
		}
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
}
