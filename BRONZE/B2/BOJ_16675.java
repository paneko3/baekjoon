// BOJ_16675_두 개의 손

import java.io.*;
import java.util.*;

public class BOJ_16675 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char ML = st.nextToken().charAt(0);
		char MR = st.nextToken().charAt(0);
		char TL = st.nextToken().charAt(0);
		char TR = st.nextToken().charAt(0);
		/* ==========sol========== */
		/* ==========output========== */
		if(ML!=MR&&TL!=TR) {
			System.out.println("?");
		}else if(ML==MR&&TL!=TR) {
			if(ML=='S'&&(TL == 'R'||TR == 'R')) {
				System.out.println("TK");
			}else if(ML=='P'&&(TL == 'S'||TR == 'S')) {
				System.out.println("TK");
			}else if(ML=='R'&&(TL == 'P'||TR == 'P')) {
				System.out.println("TK");
			}else {
				System.out.println("?");
			}
		}else if(ML!=MR&&TL==TR) {
			if(TL=='S'&&(ML == 'R'||MR == 'R')) {
				System.out.println("MS");
			}else if(TL=='P'&&(ML == 'S'||MR == 'S')) {
				System.out.println("MS");
			}else if(TL=='R'&&(ML == 'P'||MR == 'P')) {
				System.out.println("MS");
			}else {
				System.out.println("?");
			}
		}else {
			if(ML=='S') {
				if(TL=='P') {
					System.out.println("MS");
				}else if(TL=='S') {
					System.out.println("?");
				}else if(TL=='R') {
					System.out.println("TK");
				}
			}else if(ML == 'R') {
				if(TL=='P') {
					System.out.println("TK");
				}else if(TL=='S') {
					System.out.println("MS");
				}else if(TL=='R') {
					System.out.println("?");
				}
			}else if(ML == 'P') {
				if(TL=='P') {
					System.out.println("?");
				}else if(TL=='S') {
					System.out.println("TK");
				}else if(TL=='R') {
					System.out.println("MS");
				}
			}
		}
		br.close();
	}
}
