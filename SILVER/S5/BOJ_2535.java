// BOJ_2535_아시아 정보올림피아드

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2535 {
    static class Score implements Comparable<Score>{
        int a,b,c;
        public Score(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public int compareTo(Score o){
            return o.c - this.c;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Score[] scores= new Score[N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            scores[i] = new Score(a,b,c);
        }
        /* ==========sol========== */
        Arrays.sort(scores);
        int[] count = new int[101];
        int rank = 1;
        /* ==========output========== */
        for(int i=0;i<N;i++){
            int a = scores[i].a;
            if(rank>3){
                break;
            }
            if(count[a]>=2){
                continue;
            }
            rank++;
            count[a]++;
            System.out.println(a + " " + scores[i].b);
        }
        br.close();
    }
}