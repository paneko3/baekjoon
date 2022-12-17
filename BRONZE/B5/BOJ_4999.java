// BOJ_4999_아!

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
        String str2 = br.readLine();
		/* ==========sol========== */
		/* ==========output========== */
		System.out.println(str1.length()>=str2.length()?"go":"no");
		br.close();
	}
}
