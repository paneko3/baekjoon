// BOJ_1987_알파벳

import java.io.*;
import java.util.*;

public class BOJ_1987 {
	static int R, C, result;
	static char[][] map;
	static boolean[] used;
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new char[R][C];
		used = new boolean[26];
		for (int i = 0; i < R; i++) {
			String str = br.readLine();
			for (int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		/* ==========sol========== */
		result = 0;
		dfs(0, 0, 1);
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}

	static void dfs(int x, int y, int count) {
		result = Math.max(result, count);
		used[map[x][y] - 'A'] = true;
		for (int dir = 0; dir < 4; dir++) {
			int row = x + dx[dir];
			int col = y + dy[dir];
			if (row >= 0 && row < R && col >= 0 && col < C && !used[map[row][col] - 'A']) {
				dfs(row, col, count + 1);
			}
		}
		used[map[x][y] - 'A'] = false;
	}
}