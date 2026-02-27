// BOJ_10173_니모를 찾아서

import java.io.*;
import java.util.*;

public class BOJ_10173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (String s = br.readLine(); !s.equals("EOI"); s = br.readLine()) {
            /* ==========input========== */
            /* ==========sol========== */
            String result = "Missing";
            if (s.toLowerCase().contains("nemo")) { result = "Found"; }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}
