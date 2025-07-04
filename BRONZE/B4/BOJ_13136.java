// BOJ_13136_Do_Not_Touch_Anything

import java.util.*;

public class BOJ_13136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long R = sc.nextLong(), C = sc.nextLong(), N = sc.nextLong();
        
        long row = (R + N - 1) / N;
        long col = (C + N - 1) / N;

        System.out.println(row * col);
    }
}
