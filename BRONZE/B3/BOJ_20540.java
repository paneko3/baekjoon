// BOJ_20540_연길이의 이상형

import java.io.*;

public class BOJ_20540 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mbti = br.readLine();
        /* ==========sol========== */
        StringBuilder result = new StringBuilder();
        for (char c : mbti.toCharArray()) {
            if (c == 'E') {
                result.append('I');
            } else if (c == 'I') {
                result.append('E');
            } else if (c == 'S') {
                result.append('N');
            } else if (c == 'N') {
                result.append('S');
            } else if (c == 'T') {
                result.append('F');
            } else if (c == 'F') {
                result.append('T');
            } else if (c == 'J') {
                result.append('P');
            } else if (c == 'P') {
                result.append('J');
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
