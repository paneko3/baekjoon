// BOJ_12018_Yonsei TOTO

import java.io.*;
import java.util.*;

public class BOJ_12018 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        List<Integer> minMileageNeeded = new ArrayList<>();

        /* ==========sol========== */
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            List<Integer> mileages = new ArrayList<>();
            for (int j = 0; j < P; j++) {
                mileages.add(Integer.parseInt(st.nextToken()));
            }

            if (P < L) {
                minMileageNeeded.add(1);
            } else {
                Collections.sort(mileages);
                int requiredMileage = mileages.get(P - L);
                minMileageNeeded.add(requiredMileage);
            }
        }
        
        Collections.sort(minMileageNeeded);
        
        int enrolledCount = 0;
        for (int required : minMileageNeeded) {
            if (M >= required) {
                M -= required;
                enrolledCount++;
            } else {
                break;
            }
        }

        /* ==========output========== */
        System.out.println(enrolledCount);
        br.close();
    }
}
