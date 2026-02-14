// BOJ_29731_2033년 밈 투표

import java.io.*;
import java.util.*;

public class BOJ_29731 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> originalPromises = new HashSet<>(Arrays.asList(
            "Never gonna give you up",
            "Never gonna let you down",
            "Never gonna run around and desert you",
            "Never gonna make you cry",
            "Never gonna say goodbye",
            "Never gonna tell a lie and hurt you",
            "Never gonna stop"
        ));

        /* ==========sol========== */
        boolean isChanged = false;
        for (int i = 0; i < n; i++) {
            String inputPromise = br.readLine();
            if (!originalPromises.contains(inputPromise)) {
                isChanged = true;
                break;
            }
        }

        /* ==========output========== */
        System.out.println(isChanged ? "Yes" : "No");
        br.close();
    }
}
