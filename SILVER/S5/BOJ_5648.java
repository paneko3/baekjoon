// BOJ_5648_역원소 정렬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_5648 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        ArrayList<Long> list = new ArrayList<>();
        while (n!=0){
            if(st.hasMoreTokens()){
                String temp = st.nextToken();
                String reverse = "";
                for(int i=temp.length()-1;i>=0;i--){
                    reverse+=temp.charAt(i);
                }
                list.add(Long.parseLong(reverse));
            }else {
                st = new StringTokenizer(br.readLine());
                continue;
            }
            n--;
        }
        Collections.sort(list);
        /* ==========output========== */
        for(long num : list){
            System.out.println(num);
        }
        br.close();
    }
}