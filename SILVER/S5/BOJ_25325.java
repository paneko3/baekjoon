// BOJ_25325_학생 인기도 측정

import java.io.*;
import java.util.*;

public class BOJ_25325 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			map.put(st.nextToken(), 0);
		}
		/* ==========sol========== */
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				String str = st.nextToken();
				map.put(str, map.get(str)+1);
			}
		}
		List<String> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> { // 정렬
            if(map.get(o1) - map.get(o2) == 0)
                return o1.compareTo(o2);
            else
                return map.get(o2) - map.get(o1);
        });
		/* ==========output========== */
        for(String key : keySet) {
            System.out.println(key + " " + map.get(key));
        }
		br.close();
	}
}
