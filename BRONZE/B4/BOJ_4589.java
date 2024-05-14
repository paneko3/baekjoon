// BOJ_4589_Gnome Sequencing

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4589 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        System.out.println("Gnomes:");
        for(int i=0;i<N;i++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            /* ==========output========== */
            if((a>b&&b>c)||(a<b&&b<c)){
                System.out.println("Ordered");
            }else {
                System.out.println("Unordered");
            }
        }
        br.close();
    }
}