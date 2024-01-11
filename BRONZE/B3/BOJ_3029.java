// BOJ_3029_경고

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3029 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[2];
        for(int i=0;i<2;i++){
            String[] tokens = br.readLine().split(":");
            int h = Integer.parseInt(tokens[0]);
            int m = Integer.parseInt(tokens[1]);
            int s = Integer.parseInt(tokens[2]);
            arr[i]= h*3600 + m*60 + s;
        }
        /* ==========sol========== */
        int t = arr[1]-arr[0]>0?arr[1]-arr[0]:arr[1]-arr[0]+86400;
        String h = t/3600 >= 10? ""+t/3600:"0"+t/3600;
        String m = t%3600/60 >= 10? ""+t%3600/60:"0"+t%3600/60;
        String s = t%60 >= 10? ""+t%60:"0"+t%60;
        /* ==========output========== */
        System.out.println(h + ":" + m + ":" + s);
        br.close();
    }
}