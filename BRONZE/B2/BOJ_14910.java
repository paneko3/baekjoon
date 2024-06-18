// BOJ_14910_오르막

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14910 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        /* ==========sol========== */
        for(int i=0;i<arr.length-1;i++){
            if(Integer.parseInt(arr[i])>Integer.parseInt(arr[i+1])){
                System.out.println("Bad");
                return;
            }
        }
        /* ==========output========== */
        System.out.println("Good");
        br.close();
    }
}