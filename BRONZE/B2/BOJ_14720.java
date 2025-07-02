// BOJ_14720_우유_축제

import java.util.*;

public class BOJ_14720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 가게 수
        int[] milk = new int[N];
        for (int i = 0; i < N; i++) {
            milk[i] = sc.nextInt();
        }

        int expected = 0, count = 0;

        for (int i = 0; i < N; i++) {
            if (milk[i] == expected) {
                count++;
                expected = (expected + 1) % 3;
            }
        }

        System.out.println(count);
    }
}
