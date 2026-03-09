// BOJ_8394_악수

import java.util.Scanner;

public class BOJ_8394 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int n = sc.nextInt();
        /* ==========sol========== */
        int prev = 1; 
        int curr = 1; 
        
        for (int i = 2; i <= n; i++) {
            int next = (prev + curr) % 10;
            prev = curr;
            curr = next;
        }
        /* ==========output========== */
        System.out.println(curr);
        sc.close();
    }
}
