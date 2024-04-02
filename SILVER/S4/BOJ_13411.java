// BOJ_13411_하늘에서 정의가 빗발친다!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_13411 {
    static class Robot{
        int idx,x,y,v;
        public Robot(int idx, int x, int y, int v) {
            this.idx = idx;
            this.x = x;
            this.y = y;
            this.v = v;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Robot[] robots = new Robot[N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            robots[i]=new Robot(i+1,x,y,v);
        }
        /* ==========sol========== */
        Arrays.sort(robots, new Comparator<Robot>(){
            public int compare(Robot r1, Robot r2){
                double t1 = Math.sqrt(Math.pow(r1.x,2)+Math.pow(r1.y,2))/r1.v;
                double t2 = Math.sqrt(Math.pow(r2.x,2)+Math.pow(r2.y,2))/r2.v;
                if(t1==t2){
                    return r1.idx>r2.idx?1:(r1.idx<r2.idx?-1:0);
                }
                return t1>t2?1:(t1<t2?-1:0);
            }
        });
        /* ==========output========== */
        for (int i=0;i<N;i++){
            System.out.println(robots[i].idx);
        }
        br.close();
    }
}