// BOJ_2890_카약

import java.io.*;
import java.util.*;

public class BOJ_2890 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		char[][] map = new char[R+1][C+1];
		for(int i=1;i<=R;i++) {
			String str = br.readLine();
			for(int j=1;j<=C;j++) {
				map[i][j]=str.charAt(j-1);
			}
		}
		/* ==========sol========== */
		int rank = 1;
		int[] result = new int[10];
		for(int i=C-1;i>1;i--) {
			boolean flag = false;
			for(int j=1;j<=R;j++) {
				char temp = map[j][i];
				if(temp!='.'&&result[temp-'0']==0) {
					flag=true;
					result[temp-'0']=rank;
				}
			}
			if(flag) {
				rank++;
			}
		}
		/* ==========output========== */
		for(int i=1;i<=9;i++) {
			System.out.println(result[i]);
		}
		br.close();
	}
}
