// BOJ_10769_행복한지 슬픈지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10769 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i)==':'&&str.charAt(i+1)=='-'){
                if(str.charAt(i+2)==')'){
                    count1++;
                }else if(str.charAt(i+2)=='('){
                    count2++;
                }
            }
        }
        /* ==========output========== */
        if(count1==0&&count2==0){
            System.out.println("none");
        }else if(count1>count2){
            System.out.println("happy");
        }else if(count1<count2){
            System.out.println("sad");
        }else if(count1==count2){
            System.out.println("unsure");
        }
        br.close();
    }
}