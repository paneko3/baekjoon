// BOJ_11104_Fridge of Your Dreams

import java.util.Scanner;

public class BOJ_11104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int n = sc.nextInt();

        while (n-- > 0) {
            String binaryString = sc.next();

            /* ==========sol========== */
            // 2진수 문자열을 10진수 정수로 변환
            int decimalValue = Integer.parseInt(binaryString, 2);

            /* ==========output========== */
            System.out.println(decimalValue);
        }
        sc.close();
    }
}
