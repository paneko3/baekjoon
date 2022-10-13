// BOJ_10825_국영수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10825 {
    static class Member implements Comparable<Member>{
        String name;
        int score1,score2,score3;
        public Member(String name, int score1, int score2, int score3) {
            this.name = name;
            this.score1 = score1;
            this.score2 = score2;
            this.score3 = score3;
        }
        @Override
        public int compareTo(Member o) {
            if(this.score1==o.score1){
                if(this.score2==o.score2){
                    if(this.score3==o.score3){
                        return this.name.compareTo(o.name);
                    }else {
                        return o.score3-this.score3;
                    }
                }else {
                    return this.score2-o.score2;
                }
            }else {
                return o.score1-this.score1;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        Member[] members = new Member[N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String name =st.nextToken();
            int score1 =Integer.parseInt(st.nextToken());
            int score2 =Integer.parseInt(st.nextToken());
            int score3 =Integer.parseInt(st.nextToken());
            members[i]=new Member(name,score1,score2,score3);
        }
        /* ==========sol========== */
        Arrays.sort(members);
        /* ==========output========== */
        for(int i=0;i<N;i++){
            System.out.println(members[i].name);
        }
        br.close();
    }
}
