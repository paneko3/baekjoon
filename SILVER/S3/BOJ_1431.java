// BOJ_1431_시리얼 번호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ_1431 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];
        for(int i=0;i<N;i++){
            words[i]=br.readLine();
        }
        /* ==========sol========== */
        Arrays.sort(words, new Comparator<String>(){
            public int compare(String o1, String o2){
                if(o1.length()==o2.length()){
                    int count1 = 0;
                    int count2 = 0;
                    for(int i=0;i<o1.length();i++){
                        if(o1.charAt(i)>='1'&&o1.charAt(i)<='9'){
                            count1+=o1.charAt(i)-'0';
                        }
                    }
                    for(int i=0;i<o2.length();i++){
                        if(o2.charAt(i)>='1'&&o2.charAt(i)<='9'){
                            count2+=o2.charAt(i)-'0';
                        }
                    }
                    if(count1==count2){
                        return o1.compareTo(o2);
                    }else {
                        return count1 - count2;
                    }
                }else{
                    return o1.length() - o2.length();
                }
            }
        });
        /* ==========output========== */
        for(String str : words){
            System.out.println(str);
        }
        br.close();
    }
}