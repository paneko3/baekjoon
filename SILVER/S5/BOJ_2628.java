// BOJ_2628_종이자르기

import java.io.*;
import java.util.*;

public class BOJ_2628 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());

        List<Integer> horizontalCuts = new ArrayList<>();
        List<Integer> verticalCuts = new ArrayList<>();

        horizontalCuts.add(0);
        horizontalCuts.add(height);
        verticalCuts.add(0);
        verticalCuts.add(width);

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int dir = Integer.parseInt(st.nextToken());
            int pos = Integer.parseInt(st.nextToken());

            if (dir == 0) {
                horizontalCuts.add(pos);
            } else {
                verticalCuts.add(pos);
            }
        }

        /* ==========sol========== */
        Collections.sort(horizontalCuts);
        Collections.sort(verticalCuts);

        int maxHeight = 0;
        for (int i = 1; i < horizontalCuts.size(); i++) {
            maxHeight = Math.max(maxHeight, horizontalCuts.get(i) - horizontalCuts.get(i - 1));
        }

        int maxWidth = 0;
        for (int i = 1; i < verticalCuts.size(); i++) {
            maxWidth = Math.max(maxWidth, verticalCuts.get(i) - verticalCuts.get(i - 1));
        }

        int answer = maxHeight * maxWidth;

        /* ==========output========== */
        System.out.println(answer);
		br.close();
	}
}