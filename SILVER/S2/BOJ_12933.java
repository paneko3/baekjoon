// BOJ_12933_오리

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Queue;

public class BOJ_12933 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        int[] arr = new int[6];
        int max = 0;
        arr[0]=str.length();
        for(int i=0;i<str.length();i++){
            int n = 0;
            if(str.charAt(i)=='q'){
                n=1;
            }
            if(str.charAt(i)=='u'){
                n=2;
            }
            if(str.charAt(i)=='a'){
                n=3;
            }
            if(str.charAt(i)=='c'){
                n=4;
            }
            if(str.charAt(i)=='k'){
                n=5;
            }
            if(arr[n-1]==0){
                System.out.println(-1);
                return;
            }
            arr[n]++;
            arr[n-1]--;
            max = Math.max(max,arr[1]+arr[2]+arr[3]+arr[4]);
        }
        if(arr[5]*5!=str.length()){
            System.out.println(-1);
            return;
        }
        /* ==========output========== */
        System.out.println(max);
        br.close();
    }
}