// BOJ_17450_과자 사기

import java.io.*;
import java.util.*;

public class BOJ_17450 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;
		double max = 0;
		for(int i=0;i<3;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			double temp = (b*10)/(a*10>=5000?a*10-500:a*10);
			if(temp>max) {
				result=i;
				max=temp;
			}
		}
		System.out.println(result==0?"S":(result==1?"N":"U"));
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
}
