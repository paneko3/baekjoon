// BOJ_14235_크리스마스 선물

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_14235 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=0;i<n;i++){
            String str = br.readLine();
            if(!str.equals("0")){
                st = new StringTokenizer(str);
                int a = Integer.parseInt(st.nextToken());
                for(int j=0;j<a;j++){
                    queue.add(Integer.parseInt(st.nextToken()));
                }
            }else {
                if(!queue.isEmpty()){
                    System.out.println(queue.poll());
                }else {
                    System.out.println(-1);
                }
            }
        }
        br.close();
    }
}