// BOJ_1251_단어 나누기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_1251 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        /* ==========sol========== */
        ArrayList<String> list = new ArrayList<>();
        for(int i=1;i<S.length()-1;i++){
            for(int j=i+1;j<S.length();j++){
                String str1 = S.substring(0,i);
                String str2 = S.substring(i,j);
                String str3 = S.substring(j,S.length());
                String temp = reverse(str1)+reverse(str2)+reverse(str3);
                list.add(temp);
            }
        }
        Collections.sort(list);
        /* ==========output========== */
        System.out.println(list.get(0));
        br.close();
    }
    static String reverse(String str){
        String s = "";
        for(int i=str.length()-1;i>=0;i--){
            s+=str.charAt(i);
        }
        return s;
    }
}