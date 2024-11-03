// BOJ_1347_미로 만들기

import java.io.*;

public class BOJ_1347 {
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		/* ==========sol========== */
		int[][] map = new int[101][101];
		int x = 50;
		int y = 50;
		int maxX = 50;
		int maxY = 50;
		int minX = 50;
		int minY = 50;
		int dir = 0;
		map[x][y]=1;
		for(int i=0;i<N;i++) {
			char move = str.charAt(i);
			if(move=='L') {
				dir=(dir==3?0:dir+1);
			}else if(move=='R') {
				dir=(dir==0?3:dir-1);
			}else if(move=='F') {
				x += dx[dir];
				y += dy[dir];
				maxX = Math.max(maxX, x);
				maxY = Math.max(maxY, y);
				minX = Math.min(minX, x);
				minY = Math.min(minY, y);
				map[x][y]=1;
			}
		}
		/* ==========output========== */
		for(int i=minX;i<=maxX;i++) {
			for(int j=minY;j<=maxY;j++) {
				System.out.print(map[i][j]==1?".":"#");
			}
			System.out.println();
		}
		br.close();
	}
}
