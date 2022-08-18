// BOJ_1924_2007년

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1924 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x=Integer.parseInt(st.nextToken());
        int y=Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[] month ={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] day ={ "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int result=0;
        for(int i=1;i<x;i++){
            result+=month[i];
        }
        result+=y;
        /* ==========output========== */
        System.out.println(day[result%7]);
        br.close();
    }
}
