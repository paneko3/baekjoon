// BOJ_2527_직사각형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2527 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int t=0;t<4;t++){
            /* ==========input========== */
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[4];
            int[] b = new int[4];
            for(int i=0;i<4;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            for(int i=0;i<4;i++){
                b[i]=Integer.parseInt(st.nextToken());
            }
            /* ==========sol========== */
            /* ==========output========== */
            if(a[2]<b[0]||a[3]<b[1]||b[2]<a[0]||b[3]<a[1]){
                System.out.println("d");
            }else if((a[0]==b[2]&&a[1]==b[3])||(a[0]==b[2]&&a[3]==b[1])||(a[2]==b[0]&&a[3]==b[1])||(a[2]==b[0]&&a[1]==b[3])){
                System.out.println("c");
            }else if(a[2]==b[0]||a[3]==b[1]||a[0]==b[2]||a[1]==b[3]){
                System.out.println("b");
            }else {
                System.out.println("a");
            }
        }
        br.close();
    }
}