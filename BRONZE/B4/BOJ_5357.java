// BOJ_5357_Dedupe

import java.util.Scanner;

public class BOJ_5357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            
            /* ==========sol========== */
            StringBuilder sb = new StringBuilder();
            if (str.length() > 0) {
                sb.append(str.charAt(0));
                for (int j = 1; j < str.length(); j++) {
                    if (str.charAt(j) != str.charAt(j - 1)) {
                        sb.append(str.charAt(j));
                    }
                }
            }
            String result = sb.toString();
            
            /* ==========output========== */
            System.out.println(result);
        }
        sc.close();
    }
}
