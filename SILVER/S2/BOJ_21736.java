// BOJ_21736_헌내기는 친구가 필요해

import java.io.*;
import java.util.*;

public class BOJ_21736 {
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static int N, M, Ix, Iy, result;
	static char[][] map;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new char[N][M];
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			for(int j=0;j<M;j++) {
				char c = str.charAt(j);
				if(c=='I') {
					Ix=i;
					Iy=j;
				}
				map[i][j]=c;
			}
		}
		visited = new boolean[N][M];
		result = 0;
		dfs(Ix,Iy);
		System.out.println(result);
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
	static void dfs(int x, int y) {
		visited[x][y]=true;
		if(map[x][y]=='P') {
			result++;
		}
		for(int dir=0;dir<4;dir++) {
			int r = x + dx[dir];
			int c = y + dy[dir];
			if(r<0||r>=N||c<0||c>=M||visited[r][c]||map[r][c]=='X') {
				continue;
			}
			dfs(r,c);
		}
	}
}
