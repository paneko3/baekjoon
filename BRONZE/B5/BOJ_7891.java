// BOJ_7891_Can you add this?

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        /* ==========sol========== */
		/* ==========output========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
		    int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(a+b);
        }
		br.close();
	}

}
