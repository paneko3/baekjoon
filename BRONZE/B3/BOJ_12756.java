// BOJ_12756_고급 여관

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_12756 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int b1 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        /* ==========output========== */
        while (true){
            a2-=b1;
            b2-=a1;
            if(b2<=0&&a2>=1){
                System.out.println("PLAYER A");
                break;
            }else if(a2<=0&&b2>=1){
                System.out.println("PLAYER B");
                break;
            }else if(a2>=1&&b2>=1){
                continue;
            }else {
                System.out.println("DRAW");
                break;
            }
        }
        br.close();
    }
}