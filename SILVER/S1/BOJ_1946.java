// BOJ_1946_신입 사원

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_1946 {
    static class Score implements Comparable<Score> {
        int a,b;
        public Score(int a, int b) {
            this.a = a;
            this.b = b;
        }
        @Override
        public int compareTo(Score o) {
            return this.a-o.a;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            int N = Integer.parseInt(br.readLine());
            ArrayList<Score> scores = new ArrayList<>();
            for(int i=0;i<N;i++){
                st = new StringTokenizer(br.readLine());
                int a =Integer.parseInt(st.nextToken());
                int b =Integer.parseInt(st.nextToken());
                scores.add(new Score(a,b));
            }
            /* ==========sol========== */
            Collections.sort(scores);
            int result=1;
            int min=scores.get(0).b;
            for(int i=1;i<N;i++){
                if (scores.get(i).b<min){
                    result++;
                    min = scores.get(i).b;
                }
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}
