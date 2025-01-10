// BOJ_11094_꿍 가라사대

import java.io.*;

public class BOJ_11094 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		/* ==========sol========== */
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			String result = "";
			String str = br.readLine();
            if (str.contains("Simon says")){
            	result = str.substring(10);
            }else{
                continue;
            }
            sb.append(result).append("\n");
		}
		/* ==========output========== */
		System.out.println(sb);
		br.close();
	}
}
