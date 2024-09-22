// BOJ_31775_글로벌 포닉스

import java.io.*;

public class BOJ_31775 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] arr = new String[3];
		for(int i=0;i<3;i++) {
			arr[i]=br.readLine();
		}
		/* ==========sol========== */
		boolean[] flag = new boolean[3];
		for(int i=0;i<3;i++) {
			if(arr[i].charAt(0)=='l') {
				flag[0]=true;
			}
			if(arr[i].charAt(0)=='k') {
				flag[1]=true;
			}
			if(arr[i].charAt(0)=='p') {
				flag[2]=true;
			}
		}
		/* ==========output========== */
		System.out.println(flag[0]&&flag[1]&&flag[2]?"GLOBAL":"PONIX");
		br.close();
	}
}
