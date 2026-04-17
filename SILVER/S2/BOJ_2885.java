// BOJ_2885_초콜릿 식사
import java.util.Scanner;

public class BOJ_2885 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int k = sc.nextInt();

        /* ==========sol========== */
        int size = 1;
        while (size < k) {
            size *= 2;
        }

        int resultSize = size;
        int count = 0;

        if (size != k) {
            while (k > 0) {
                size /= 2;
                count++;
                if (k >= size) {
                    k -= size;
                }
            }
        }

        /* ==========output========== */
        System.out.println(resultSize + " " + count);
        sc.close();
    }
}
