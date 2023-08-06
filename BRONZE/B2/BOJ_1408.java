// BOJ_1408_24

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1408 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] time = new int[2];
        for(int i=0;i<2;i++){
            String str = br.readLine();
            String[] arr = str.split(":");
            time[i]+=Integer.parseInt(arr[0])*3600;
            time[i]+=Integer.parseInt(arr[1])*60;
            time[i]+=Integer.parseInt(arr[2]);
        };
        /* ==========sol========== */
        int t = time[1]-time[0]>0?time[1]-time[0]:24*3600-(time[0]-time[1]);
        /* ==========output========== */
        System.out.format("%02d:%02d:%02d", (t / 3600), ((t / 60) % 60), (t % 60));
        br.close();
    }
}