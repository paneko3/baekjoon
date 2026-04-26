// BOJ_4619_루트
import java.util.Scanner;

public class BOJ_4619 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            /* ==========input========== */
            int b = sc.nextInt();
            int n = sc.nextInt();

            if (b == 0 && n == 0) break;

            /* ==========sol========== */
            int a = 1;
            while (Math.pow(a, n) < b) {
                a++;
            }

            int currentPow = (int) Math.pow(a, n);
            int prevPow = (int) Math.pow(a - 1, n);

            int result;
            if (Math.abs(currentPow - b) < Math.abs(prevPow - b)) {
                result = a;
            } else {
                result = a - 1;
            }

            /* ==========output========== */
            System.out.println(result);
        }
        sc.close();
    }
}
