// BOJ_10174_팰린드롬

import java.util.Scanner;

public class BOJ_10174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            
            /* ==========sol========== */
            String lowerLine = line.toLowerCase();
            boolean isPalindrome = true;
            int len = lowerLine.length();
            
            for (int j = 0; j < len / 2; j++) {
                if (lowerLine.charAt(j) != lowerLine.charAt(len - 1 - j)) {
                    isPalindrome = false;
                    break;
                }
            }
            
            /* ==========output========== */
            if (isPalindrome) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
