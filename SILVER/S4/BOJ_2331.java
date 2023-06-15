// BOJ_2331_반복수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_2331 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(A);
        /* ==========output========== */
        while (true){
            int temp = list.get(list.size()-1);
            int sum = 0;
            while (temp!=0){
                sum+=(int)(Math.pow(temp%10,P));
                temp/=10;
            }
            if(list.contains(sum)){
                System.out.println(list.indexOf(sum));
                break;
            }else {
                list.add(sum);
            }
        }
        br.close();
    }
}