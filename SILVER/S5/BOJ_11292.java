// BOJ_11292_키 큰 사람

import java.io.*;
import java.util.*;

public class BOJ_11292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			/* ==========input========== */
			int N = Integer.parseInt(br.readLine());
			/* ==========sol========== */
			if(N==0) {
				break;
			}
			String[][] arr = new String[N][2];
			double max = 0;
			for(int i=0;i<N;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				String h = st.nextToken();
				arr[i][0]=name;
				arr[i][1]=h;
				if(Double.parseDouble(h)>max) {
					max = Double.parseDouble(h);
				}
			}
			/* ==========output========== */
			for(int i=0;i<N;i++) {
				if(Double.parseDouble(arr[i][1])==max) {
					System.out.print(arr[i][0]+" ");
				}
			}
			System.out.println();
		}
		br.close();
	}
}
