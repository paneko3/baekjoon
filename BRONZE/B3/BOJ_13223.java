// BOJ_13223_소금 폭탄

import java.io.*;

public class BOJ_13223 {
    
    private static int timeToSeconds(String timeStr) {
        String[] parts = timeStr.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int s = Integer.parseInt(parts[2]);
        return h * 3600 + m * 60 + s;
    }

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String currentTimeStr = br.readLine();
        String targetTimeStr = br.readLine();

        /* ==========sol========== */
        
        int currentSec = timeToSeconds(currentTimeStr);
        int targetSec = timeToSeconds(targetTimeStr);
        
        int diffSec = targetSec - currentSec;
        
        if (diffSec <= 0) {
            diffSec += (24 * 3600);
        }
        
        int h_out = diffSec / 3600;
        diffSec %= 3600;
        int m_out = diffSec / 60;
        int s_out = diffSec % 60;
        
        String result = String.format("%02d:%02d:%02d", h_out, m_out, s_out);

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
