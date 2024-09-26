// BOJ_23290_마법사 상어와 복제

import java.io.*;
import java.util.*;

public class BOJ_23290 {
	static int[] dx = {0,0,-1,-1,-1,0,1,1,1};
	static int[] dy = {0,-1,-1,0,1,1,1,0,-1};
	static int[] dir = {0,3,1,7,5};
	static int M, S, Sx, Sy;
	static int[][] record;
	static int[][][] fishs, temp;
	static boolean[][] pre, prepre;
	static class Fish{
		int r,c,d; 
		int type;// type 1 물고기, 2 냄새, 3 오래된 냄새
		public Fish(int r,int c, int d, int type) {
			this.r = r;
			this.c = c;
			this.d = d;
			this.type = type;
		}
	}
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		fishs = new int[5][5][9];
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			fishs[r][c][d]++;
		}
		st = new StringTokenizer(br.readLine());
		Sx = Integer.parseInt(st.nextToken());
		Sy = Integer.parseInt(st.nextToken());
		pre = new boolean[5][5];
		prepre = new boolean[5][5];
		for(int s=0;s<S;s++) {
			step1();
			step2();
			step3();
			step4();
			step5();
		}
		int result = 0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				for(int k=1;k<=8;k++) {
					result+=fishs[i][j][k];
				}
			}
		}
		System.out.println(result);
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}
	static void step5() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				for(int k=1;k<=8;k++) {
					fishs[i][j][k]+=temp[i][j][k];
				}
			}
		}
	}
	static void step4() {
		prepre = new boolean[5][5];
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				prepre[i][j]=pre[i][j];
			}
		}
		pre = new boolean[5][5];
		for(int i=0;i<3;i++) {
			int x = record[i][0];
			int y = record[i][1];
			boolean flag = false;
			for(int j=1;j<=8;j++) {
				if(temp[x][y][j]>0) {
					temp[x][y][j]=0;
					flag=true;
				}
			}
			pre[x][y]=pre[x][y]||flag;
		}
	}
	static void step3() {
		int max = -1;
		record = new int[3][2]; 
		int x = Sx;
		int y = Sy;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				for(int k=1;k<=4;k++) {
					int[][][] temp2 = new int[5][5][9];
					for(int a=1;a<=4;a++) {
						for(int b=1;b<=4;b++) {
							for(int c=1;c<=8;c++) {
								temp2[a][b][c]=temp[a][b][c];
							}
						}
					}
					int count = 0;
					int dirI = dir[i];
					int dirJ = dir[j];
					int dirK = dir[k];
					int nr = x + dx[dirI];
					int nc = y + dy[dirI];
					if(nr<1||nr>4||nc<1||nc>4) {  
						continue;
					}
					for(int l=1;l<=8;l++) {
						count+=temp2[nr][nc][l];
						temp2[nr][nc][l]=0;
					}
					nr += dx[dirJ];
					nc += dy[dirJ];
					if(nr<1||nr>4||nc<1||nc>4) {  
						continue;
					}
					for(int l=1;l<=8;l++) {
						count+=temp2[nr][nc][l];
						temp2[nr][nc][l]=0;
					}
					nr += dx[dirK];
					nc += dy[dirK];
					if(nr<1||nr>4||nc<1||nc>4) {  
						continue;
					}
					for(int l=1;l<=8;l++) {
						count+=temp2[nr][nc][l];
						temp2[nr][nc][l]=0;
					}
					if(count>max) {
						record[0][0]= x + dx[dirI];
						record[0][1]= y + dy[dirI];
						record[1][0]= record[0][0] + dx[dirJ];
						record[1][1]= record[0][1] + dy[dirJ];
						record[2][0]= record[1][0] + dx[dirK];
						record[2][1]= record[1][1] + dy[dirK];
						max=count;
						Sx=record[2][0];
						Sy=record[2][1];
					}
				}
			}
		}
	}
	static void step2() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				for(int k=1;k<=8;k++) {
					if(fishs[i][j][k]==0) {
						continue;
					}
					boolean flag = false;
					for(int l=0;l<=7;l++) {
						int d = k-l<1?k-l+8:k-l;
						int nr = i + dx[d];
						int nc = j + dy[d];
						if(nr<1||nr>4||nc<1||nc>4||(nr==Sx&&nc==Sy)||pre[nr][nc]||prepre[nr][nc]) { 
							continue;
						}
						temp[nr][nc][d]+=fishs[i][j][k];
						flag = true;
						break;
					}
					if(!flag) {
						temp[i][j][k]+=fishs[i][j][k];
					}
				}
			}
		}
	}
	static void step1() {
		temp = new int[5][5][9];
	}
}
