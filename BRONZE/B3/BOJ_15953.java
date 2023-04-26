// BOJ_15953_상금 헌터

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int i=0;i<T;i++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            int result = 0;
            if(a==1) result+=500;
            else if(a>=2&&a<=3) result+=300;
            else if(a>=4&&a<=6) result+=200;
            else if(a>=7&&a<=10) result+=50;
            else if(a>=11&&a<=15) result+=30;
            else if(a>=16&&a<=21) result+=10;
            if(b==1) result+=512;
            else if(b>=2&&b<=3) result+=256;
            else if(b>=4&&b<=7) result+=128;
            else if(b>=8&&b<=15) result+=64;
            else if(b>=16&&b<=31) result+=32;
            /* ==========output========== */
            System.out.println(result*10000);
        }
        br.close();
    }
}
