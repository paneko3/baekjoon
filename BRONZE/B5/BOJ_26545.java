// BOJ_26545_Mathematics

import java.util.*;
import java.io.*;

public class BOJ_26545 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i=0;i<N;i++){
            result +=Integer.parseInt(br.readLine());
        }
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println(result);
		br.close();
	}
