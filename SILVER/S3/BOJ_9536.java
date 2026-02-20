// BOJ_9536_여우는 어떻게 울지?

import java.io.*;
import java.util.*;

public class BOJ_9536 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            /* ==========input========== */
            String line = br.readLine();
            Set<String> set = new HashSet<>();
            for (String s = br.readLine(); !s.equals("what does the fox say?"); s = br.readLine()) {
                StringTokenizer st = new StringTokenizer(s);
                st.nextToken(); st.nextToken();
                set.add(st.nextToken());
            }
            /* ==========sol========== */
            StringBuilder result = new StringBuilder();
            StringTokenizer st = new StringTokenizer(line);
            for (; st.hasMoreTokens(); ) {
                String sound = st.nextToken();
                if (!set.contains(sound)) { result.append(sound).append(" "); }
            }
            /* ==========output========== */
            System.out.println(result.toString().trim());
        }
        br.close();
    }
}
