// BOJ_15970_화살표_그리기

import java.util.*;

public class BOJ_15970 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 색깔별 점 위치 저장
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt(), color = sc.nextInt();
            map.computeIfAbsent(color, k -> new ArrayList<>()).add(x);
        }

        long result = 0;

        for (ArrayList<Integer> list : map.values()) {
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                int dist = Integer.MAX_VALUE;
                if (i > 0) {
                    dist = Math.min(dist, list.get(i) - list.get(i - 1));
                }
                if (i < list.size() - 1) {
                    dist = Math.min(dist, list.get(i + 1) - list.get(i));
                }
                result += dist;
            }
        }

        System.out.println(result);
    }
}
