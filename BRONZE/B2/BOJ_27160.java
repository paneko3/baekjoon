// BOJ_27160_할리갈리

import java.io.*;
import java.util.*;

public class BOJ_27160 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        /* ==========sol========== */
        Map<String, Integer> fruitCounts = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken();
            int count = Integer.parseInt(st.nextToken());
            
            fruitCounts.put(fruit, fruitCounts.getOrDefault(fruit, 0) + count);
        }
        
        boolean bellShouldBeRung = false;
        
        for (int count : fruitCounts.values()) {
            if (count == 5) {
                bellShouldBeRung = true;
                break;
            }
        }

        /* ==========output========== */
        if (bellShouldBeRung) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        br.close();
    }
}
