// BOJ_2641_다각형그리기

import java.util.*;

public class BOJ_2641 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        int len = sc.nextInt();
        int[] target = new int[len];
        for (int i = 0; i < len; i++) {
            target[i] = sc.nextInt();
        }

        /* ==========sol========== */
        List<int[]> validPatterns = new ArrayList<>();
        
        for (int i = 0; i < len; i++) {
            validPatterns.add(getShifted(target, i));
        }

        int[] reverseInverted = new int[len];
        for (int i = 0; i < len; i++) {
            reverseInverted[i] = getOpposite(target[len - 1 - i]);
        }

        for (int i = 0; i < len; i++) {
            validPatterns.add(getShifted(reverseInverted, i));
        }

        int m = sc.nextInt();
        List<String> results = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int[] current = new int[len];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < len; j++) {
                current[j] = sc.nextInt();
                sb.append(current[j]).append(" ");
            }

            for (int[] pattern : validPatterns) {
                if (Arrays.equals(pattern, current)) {
                    results.add(sb.toString().trim());
                    break;
                }
            }
        }

        /* ==========output========== */
        System.out.println(results.size());
        for (String res : results) {
            System.out.println(res);
        }
        sc.close();
    }

    private static int[] getShifted(int[] arr, int k) {
        int n = arr.length;
        int[] shifted = new int[n];
        for (int i = 0; i < n; i++) {
            shifted[i] = arr[(i + k) % n];
        }
        return shifted;
    }

    private static int getOpposite(int dir) {
        if (dir == 1) return 3;
        if (dir == 2) return 4;
        if (dir == 3) return 1;
        return 2;
    }
}
