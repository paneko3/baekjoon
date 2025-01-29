// BOJ_28114_팀명 정하기

import java.io.*;
import java.util.*;

public class BOJ_28114 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		HashMap<Integer, String> map = new HashMap<>();
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		for(int i=0;i<3;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken())%100;
			String name = st.nextToken();
			arr1[i]=y;
			arr2[i]=s;
			map.put(s, name);
		}
		/* ==========sol========== */
		Arrays.sort(arr1);
        Arrays.sort(arr2);
		/* ==========output========== */
        for (int i = 0; i < 3; i++) {
            System.out.print(arr1[i]);
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(map.get(arr2[i]).charAt(0));
        }
		br.close();
	}
}
