// BOJ_20001_고무오리 디버깅

import java.io.*;

public class BOJ_20001 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        
        int problems = 0;
        String line;
        while (!(line = br.readLine()).equals("고무오리 디버깅 끝")) {
            /* ==========sol========== */
            if (line.equals("문제")) {
                problems++;
            } else if (line.equals("고무오리")) {
                if (problems > 0) {
                    problems--;
                } else {
                    problems += 2;
                }
            }
        }
        /* ==========output========== */
        if (problems == 0) {
            System.out.println("고무오리야 사랑해");
        } else {
            System.out.println("힝구");
        }
        br.close();
    }
}
