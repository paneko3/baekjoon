// BOJ_25628_햄버거 만들기

import java.io.*;
import java.util.*;

public class BOJ_25628 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); 
        int B = Integer.parseInt(st.nextToken()); 

        /* ==========sol========== */
        int result = Math.min(A / 2, B);

        /* ==========output========== */
        System.out.println(result);
		br.close();
	}
}