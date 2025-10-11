// BOJ_19583_싸이버개강총회

import java.io.*;
import java.util.*;

public class BOJ_19583 {
    
    private static int timeToMin(String tStr) {
        String[] parts = tStr.split(":");
        int H = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);
        return H * 60 + M;
    }
    
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String sStr = st.nextToken();
        String eStr = st.nextToken();
        String qStr = st.nextToken();

        int s = timeToMin(sStr);
        int e = timeToMin(eStr);
        int q = timeToMin(qStr);

        /* ==========sol========== */
        Set<String> entry = new HashSet<>();
        Set<String> exit = new HashSet<>();
        
        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            st = new StringTokenizer(line);
            if (!st.hasMoreTokens()) continue; 
            
            String tStr = st.nextToken();
            String name = st.nextToken();
            int t = timeToMin(tStr);
            
            if (t <= s) {
                entry.add(name);
            }
            else if (t >= e && t <= q) {
                if (entry.contains(name)) {
                    exit.add(name);
                }
            }
        }
        
        int ans = exit.size();

        /* ==========output========== */
        System.out.println(ans);
        br.close();
    }
}
