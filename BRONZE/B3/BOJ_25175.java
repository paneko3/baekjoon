// BOJ_25175_두~~부 두부 두부

import java.io.*;
import java.util.*;

public class BOJ_25175 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken()); 
        int K = Integer.parseInt(st.nextToken()); 
		/* ==========sol========== */
        int move = K - 3;
        int next = ((M - 1 + move) % N + N) % N + 1; 
		/* ==========output========== */
        System.out.println(next);
		br.close();
	}
}