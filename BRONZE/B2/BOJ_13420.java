// BOJ_13420_사칙연산

import java.util.Scanner;

public class BOJ_13420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            /* ==========input========== */
            long a = sc.nextLong();
            String op = sc.next();
            long b = sc.nextLong();
            sc.next(); // '=' 기호 스킵
            long target = sc.nextLong();

            /* ==========sol========== */
            long calc = 0;
            if (op.equals("+")) {
                calc = a + b;
            } else if (op.equals("-")) {
                calc = a - b;
            } else if (op.equals("*")) {
                calc = a * b;
            } else if (op.equals("/")) {
                calc = a / b;
            }

            String result = (calc == target) ? "correct" : "wrong answer";

            /* ==========output========== */
            System.out.println(result);
        }
        sc.close();
    }
}
