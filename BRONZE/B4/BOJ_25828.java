// BOJ_25828_Corona Virus Testing

import java.io.*;
import java.util.*;

public class BOJ_25828 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int g = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int individualTests = g * p;
        int groupTests = g + (t * p);
        int result = (individualTests < groupTests) ? 1 : (individualTests > groupTests) ? 2 : 0;

        /* ==========output========== */
        System.out.println(result);
	}
}