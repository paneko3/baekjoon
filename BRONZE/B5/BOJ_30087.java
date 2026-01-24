// BOJ_30087_진흥원 세미나

import java.io.*;
import java.util.*;

public class BOJ_30087 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Map<String, String> seminarMap = new HashMap<>();
        seminarMap.put("Algorithm", "204");
        seminarMap.put("DataAnalysis", "207");
        seminarMap.put("ArtificialIntelligence", "302");
        seminarMap.put("CyberSecurity", "B101");
        seminarMap.put("Network", "303");
        seminarMap.put("Startup", "501");
        seminarMap.put("TestStrategy", "105");

        /* ==========sol & output========== */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String subject = br.readLine();
            sb.append(seminarMap.get(subject)).append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}
