// BOJ_23812_골뱅이 찍기 - 돌아간 ㅍ

import java.io.*;

public class BOJ_23812 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		/* ==========sol========== */
		/* ==========output========== */
		for(int k=0;k<5;k++) {
			if(k%2==0) {
				for(int i=0;i<N;i++){
		            for(int j=0;j<N;j++) sb.append("@");
		            for(int j=0;j<N;j++) sb.append("   ");
		            for(int j=0;j<N;j++) sb.append("@");
		            sb.append("\n");
		        }
			}else {
				for(int i=0;i<N;i++){
		            for(int j=0;j<N;j++) sb.append("@@@@@");
		            sb.append("\n");
		        }
			}
		}
	
		System.out.println(sb);
		br.close();
	}
}
