// BOJ_20374_Big Money

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_20374 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /* ==========input========== */
        long totalCents = 0;
        String line;

        /* ==========sol========== */
        while ((line = br.readLine()) != null) {
            int dotIdx = line.indexOf('.');
            if (dotIdx == -1) continue;

            long euro = Long.parseLong(line.substring(0, dotIdx));
            long cent = Long.parseLong(line.substring(dotIdx + 1));
            totalCents += euro * 100 + cent;
        }

        /* ==========output========== */
        System.out.printf("%d.%02d\n", totalCents / 100, totalCents % 100);
        br.close();
    }
}
