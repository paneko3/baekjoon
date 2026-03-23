// BOJ_5656_비교 연산자

import java.util.Scanner;

public class BOJ_5656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1;

        while (true) {
            /* ==========input========== */
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();

            if (op.equals("E")) break;

            /* ==========sol========== */
            boolean res = false;
            switch (op) {
                case ">":  res = a > b; break;
                case ">=": res = a >= b; break;
                case "<":  res = a < b; break;
                case "<=": res = a <= b; break;
                case "==": res = a == b; break;
                case "!=": res = a != b; break;
            }

            /* ==========output========== */
            System.out.println("Case " + cnt + ": " + res);
            cnt++;
        }
        sc.close();
    }
}
