// BOJ_26489_Gum Gum for Jay Jay

import java.io.*;
import java.util.*;

public class BOJ_26489 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        /* ==========sol========== */
        int count = 0;
        String line;
        while ((line = br.readLine()) != null) {
            count++;
        }

        /* ==========output========== */
        System.out.println(count);
        br.close();
    }
}
