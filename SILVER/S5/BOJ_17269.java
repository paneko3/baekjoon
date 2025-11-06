// BOJ_17269_이름궁합 테스트

import java.io.*;
import java.util.*;

public class BOJ_17269 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        /* ==========sol========== */
        int[] strokes = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};

        ArrayList<Integer> currentList = new ArrayList<>();
        
        int minLen = Math.min(N, M);
        for (int i = 0; i < minLen; i++) {
            currentList.add(strokes[A.charAt(i) - 'A']);
            currentList.add(strokes[B.charAt(i) - 'A']);
        }
        
        if (N > M) {
            for (int i = M; i < N; i++) {
                currentList.add(strokes[A.charAt(i) - 'A']);
            }
        } else if (M > N) {
            for (int i = N; i < M; i++) {
                currentList.add(strokes[B.charAt(i) - 'A']);
            }
        }
        
        while (currentList.size() > 2) {
            ArrayList<Integer> nextList = new ArrayList<>();
            for (int i = 0; i < currentList.size() - 1; i++) {
                int sum = currentList.get(i) + currentList.get(i + 1);
                nextList.add(sum % 10);
            }
            currentList = nextList;
        }

        /* ==========output========== */
        int firstDigit = currentList.get(0);
        int secondDigit = currentList.get(1);

        if (firstDigit == 0) {
            System.out.println(secondDigit + "%");
        } else {
            System.out.println("" + firstDigit + secondDigit + "%");
        }
        
        br.close();
    }
}
