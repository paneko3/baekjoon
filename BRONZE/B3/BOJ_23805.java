// BOJ_23805_골뱅이 찍기 - 돌아간 ㄹ

import java.io.*;

public class BOJ_23805 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<5;i++) {
			StringBuilder temp = new StringBuilder();
			char c = '@';
			for(int j=0;j<5;j++) {
				for(int k=0;k<N;k++) {
					if((j==1&&i!=0)||(j==3&&i!=4)) {
						c=' ';
					}else {
						c='@';
					}
					temp.append(c);
				}
			}
			for(int k=0;k<N;k++) {
				sb.append(temp).append("\n");
			}
		}
		/* ==========output========== */
		System.out.println(sb);
		br.close();
	}
}
