// BOJ_13904_과제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_13904 {
    static class Homework {
        int d, w;
        public Homework(int d, int w){
            this.d = d;
            this.w = w;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        ArrayList<Homework> homeworks = new ArrayList<>();
        int maxD = 0;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            homeworks.add(new Homework(d,w));
            maxD = Math.max(maxD, d);
        }
        /* ==========sol========== */
        int result=0;
        for(int i=maxD;i>0;i--){
            Homework temp = new Homework(0,0);
            for(Homework h : homeworks){
                if(h.d >= i){
                    if(h.w>temp.w){
                        temp = h;
                    }
                }
            }
            result += temp.w;
            homeworks.remove(temp);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
