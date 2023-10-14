// BOJ_4779_칸토어 집합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ_4779 {
    static char[] output;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str=br.readLine())!=null){
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(str);
            /* ==========sol========== */
            int size = (int) Math.pow(3,N);
            output = new char[size];
            Arrays.fill(output,'-');
            re(size,0,size);
            sb.append(output);
            /* ==========output========== */
            System.out.println(sb);
        }
        br.close();
    }
    static void re(int size, int start, int end){
        if(size==1){
            return;
        }else {
            int n1 = start+size/3;
            int n2 = end-size/3;
            for(int i=n1;i<n2;i++){
                output[i]=' ';
            }
            re(size/3,start,n1);
            re(size/3,n2,end);
        }
    }
}