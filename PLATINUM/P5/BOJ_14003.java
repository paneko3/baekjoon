// BOJ_14003_가장 긴 증가하는 부분 수열 5

import java.io.*;
import java.util.*;

public class BOJ_14003 {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] seq = new int[n];
        int[] preIndex = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
        	seq[i] = Integer.parseInt(st.nextToken());
        }

		/* ==========sol========== */
        ArrayList<Integer> preLIS = new ArrayList<>();
        preLIS.add(seq[0]);
        for (int i = 1; i < n; i++) {
            int key = seq[i];

            if (preLIS.get(preLIS.size() - 1) < key) {
                preLIS.add(key);
                preIndex[i] = preLIS.size() - 1;
            } else {
                int low = 0;
                int high = preLIS.size() - 1;
                while (low < high) {
                    int mid = (low + high) / 2;
                    if (preLIS.get(mid) >= key) high = mid;
                    else low = mid + 1;
                }
                preLIS.set(high, key);
                preIndex[i] = high;
            }
        }
        sb.append(preLIS.size() + "\n");

        Stack<Integer> stack = new Stack<>();
        int index = preLIS.size() - 1;
        for (int i = n - 1; i >= 0; i--){
            if (preIndex[i] == index){
                index--;
                stack.push(seq[i]);
            }
        }
        while (!stack.isEmpty()) sb.append(stack.pop() + " ");
		/* ==========output========== */
        System.out.println(sb);
    }
}
