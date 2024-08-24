// BOJ_13698_Hawk eyes

import java.io.*;

public class BOJ_13698 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		/* ==========sol========== */
		int[] arr = {1,0,0,2};
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			int temp;
			if(c=='A') {
				temp = arr[0];
				arr[0]=arr[1];
				arr[1]=temp;
			}else if(c=='B') {
				temp = arr[0];
				arr[0]=arr[2];
				arr[2]=temp;
			}else if(c=='C') {
				temp = arr[0];
				arr[0]=arr[3];
				arr[3]=temp;
			}else if(c=='D') {
				temp = arr[1];
				arr[1]=arr[2];
				arr[2]=temp;
			}else if(c=='E') {
				temp = arr[1];
				arr[1]=arr[3];
				arr[3]=temp;
			}else if(c=='F') {
				temp = arr[2];
				arr[2]=arr[3];
				arr[3]=temp;
			}
		}
		/* ==========output========== */
		for(int i=0;i<4;i++) {
			if(arr[i]==1) {
				System.out.println(i+1);
				break;
			}
		}
		for(int i=0;i<4;i++) {
			if(arr[i]==2) {
				System.out.println(i+1);
				break;
			}
		}
		br.close();
	}
}
