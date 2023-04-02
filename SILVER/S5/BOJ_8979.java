// BOJ_8979_올림픽

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_8979 {
    static class Medal implements Comparable<Medal>{
        int num, g, s, b;
        public Medal(int num, int g, int s, int b) {
            this.num = num;
            this.g = g;
            this.s = s;
            this.b = b;
        }
        public int compareTo(Medal o){
            if(this.g == o.g){
                if(this.s == o.s){
                    return o.b - this.b;
                }else {
                    return o.s - this.s;
                }
            }else {
                return o.g - this.g;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Medal[] medals = new Medal[N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            medals[i] = new Medal(num, g, s, b);
        }
        /* ==========sol========== */
        Arrays.sort(medals);
        int result=1;
        int count=1;
        Medal temp = new Medal(0,-1,-1,-1);
        if(medals[0].num == K){
            System.out.println(1);
            return;
        }
        for(int i=1;i<N;i++){
            Medal now = medals[i];
            if(now.g == temp.g && now.s == temp.s && now.b == temp.b){
                count++;
            }else {
                result += count;
                count=1;
            }
            if(now.num == K){
                break;
            }
            temp = medals[i];
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
