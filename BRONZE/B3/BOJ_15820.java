// BOJ_15820_맞았는데 왜 틀리죠?

import java.util.Scanner;

public class BOJ_15820 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        boolean samplePass = true;
        boolean systemPass = true;

        for (int i = 0; i < s1; i++) {
            long ans = sc.nextLong();
            long user = sc.nextLong();
            if (ans != user) samplePass = false;
        }

        for (int i = 0; i < s2; i++) {
            long ans = sc.nextLong();
            long user = sc.nextLong();
            if (ans != user) systemPass = false;
        }

        /* ==========sol========== */
        String result;
        if (!samplePass) {
            result = "Wrong Answer";
        } else if (!systemPass) {
            result = "Why Wrong!!!";
        } else {
            result = "Accepted";
        }

        /* ==========output========== */
        System.out.println(result);
        sc.close();
    }
}
