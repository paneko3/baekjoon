// BOJ_17293_맥주 99병

import java.io.*;

public class BOJ_17293 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		StringBuilder sb = new StringBuilder();
		int first = N;
		while(N!=0) {
			if(N>1) {
				if(N-1>1) {
					sb.append(N).append(" bottles of beer on the wall, ");
					sb.append(N).append(" bottles of beer.\n");
					sb.append("Take one down and pass it around, ");
					sb.append(N-1).append(" bottles of beer on the wall.\n");
				}else {
					sb.append(N).append(" bottles of beer on the wall, ");
					sb.append(N).append(" bottles of beer.\n");
					sb.append("Take one down and pass it around, 1 bottle of beer on the wall.\n");
				}
			}else if(N==1){
				sb.append(N).append(" bottle of beer on the wall, ");
				sb.append(N).append(" bottle of beer.\n");
				sb.append("Take one down and pass it around, no more bottles of beer on the wall.\n");
			}
			sb.append("\n");
			N--;
		}
		if(first!=1) {
			sb.append("No more bottles of beer on the wall, no more bottles of beer.\n");
			sb.append("Go to the store and buy some more, ");
			sb.append(first).append(" bottles of beer on the wall.\n");
		}else {
			sb.append("No more bottles of beer on the wall, no more bottles of beer.\n");
			sb.append("Go to the store and buy some more, ");
			sb.append(first).append(" bottle of beer on the wall.\n");
		}
		/* ==========output========== */
		System.out.println(sb);
		br.close();
	}
}
