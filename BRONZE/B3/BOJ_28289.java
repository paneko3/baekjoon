// BOJ_28289_과 조사하기

import java.io.*;
import java.util.*;

public class BOJ_28289 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int P = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int dev = 0;
        int embed = 0;
        int ai = 0;
        int unknown = 0;
        for (int i = 0; i < P; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int grade = Integer.parseInt(st.nextToken());
            int classroom = Integer.parseInt(st.nextToken());
            st.nextToken(); 
            if (grade >= 2) {
                if (classroom == 1 || classroom == 2) {
                    dev++;
                } else if (classroom == 3) {
                    embed++;
                } else if (classroom == 4) {
                    ai++;
                }
            } else {
                unknown++;
            }
        }
        /* ==========output========== */
        System.out.println(dev);
        System.out.println(embed);
        System.out.println(ai);
        System.out.println(unknown);
		br.close();
	}
}