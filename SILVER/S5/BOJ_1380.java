// BOJ_1380_귀걸이

import java.io.*;
import java.util.*;

public class BOJ_1380 {

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int scenario = 1;
        while (true) {
            String line = br.readLine();
            if (line.equals("0")) break;
            
            int n = Integer.parseInt(line);
            
            String[] names = new String[n + 1];
            for (int i = 1; i <= n; i++) {
                names[i] = br.readLine();
            }
            
            boolean[] isMissing = new boolean[n + 1]; 
            
            for (int i = 0; i < 2 * n - 1; i++) {
                String record = br.readLine();
                StringTokenizer st = new StringTokenizer(record);
                int studentNum = Integer.parseInt(st.nextToken());
                
                isMissing[studentNum] = !isMissing[studentNum];
            }
            
            /* ==========sol========== */
            String missingName = "";
            
            for (int i = 1; i <= n; i++) {
                if (isMissing[i]) {
                    missingName = names[i];
                    break; 
                }
            }
            
            /* ==========output========== */
            sb.append(scenario).append(" ").append(missingName).append('\n');
            scenario++;
        }
        
        System.out.print(sb.toString());
        br.close();
    }
}
