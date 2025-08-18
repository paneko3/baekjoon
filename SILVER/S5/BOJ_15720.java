// BOJ_15720_카우버거

import java.io.*;
import java.util.*;

public class BOJ_15720 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int[] burgers = new int[b];
        int[] sides = new int[c];
        int[] drinks = new int[d];
        
        int totalOriginalPrice = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            burgers[i] = Integer.parseInt(st.nextToken());
            totalOriginalPrice += burgers[i];
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < c; i++) {
            sides[i] = Integer.parseInt(st.nextToken());
            totalOriginalPrice += sides[i];
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < d; i++) {
            drinks[i] = Integer.parseInt(st.nextToken());
            totalOriginalPrice += drinks[i];
        }
        /* ==========sol========== */
        Arrays.sort(burgers);
        Arrays.sort(sides);
        Arrays.sort(drinks);

        int minCount = Math.min(b, Math.min(c, d));
        double discountedPrice = 0;

        for (int i = 0; i < minCount; i++) {
            discountedPrice += (burgers[b - 1 - i] + sides[c - 1 - i] + drinks[d - 1 - i]) * 0.9;
        }

        for (int i = 0; i < b - minCount; i++) {
            discountedPrice += burgers[i];
        }
        for (int i = 0; i < c - minCount; i++) {
            discountedPrice += sides[i];
        }
        for (int i = 0; i < d - minCount; i++) {
            discountedPrice += drinks[i];
        }
        
        /* ==========output========== */
        System.out.println(totalOriginalPrice);
        System.out.println((int) discountedPrice);
        br.close();
    }
}
