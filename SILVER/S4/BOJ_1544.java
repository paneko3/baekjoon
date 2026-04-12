// BOJ_1544_사이클 단어

import java.util.*;

public class BOJ_1544 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int n = Integer.parseInt(sc.nextLine());
        List<String> distinctWords = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String currentWord = sc.nextLine();

            /* ==========sol========== */
            boolean isNewCycle = true;
            for (String word : distinctWords) {
                if (word.length() == currentWord.length()) {
                    String combined = word + word;
                    if (combined.contains(currentWord)) {
                        isNewCycle = false;
                        break;
                    }
                }
            }

            if (isNewCycle) {
                distinctWords.add(currentWord);
            }
        }

        /* ==========output========== */
        System.out.println(distinctWords.size());
        sc.close();
    }
}
