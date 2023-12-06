// BOJ_4880_다음수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4880 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            /* ==========input========== */
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int a3 = Integer.parseInt(st.nextToken());
            if(a1==0&&a2==0&&a3==0){
                break;
            }
            /* ==========sol========== */
            /* ==========output========== */
            if((a2-a1)==(a3-a2)){
                System.out.println("AP " + (a3+a2-a1));
            }else {
                System.out.println("GP " + (a3*a2/a1));
            }
        }
        br.close();
    }
}