// BOJ_11328_Strfry

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        for(int i=0;i<N;i++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();
            /* ==========sol========== */
            int[] count = new int[26];
            for(int j=0;j<str1.length();j++){
                count[str1.charAt(j)-'a']++;
            }
            for(int j=0;j<str2.length();j++){
                count[str2.charAt(j)-'a']--;
            }
            boolean flag = false;
            for(int j=0;j<26;j++){
                if(count[j]!=0){
                    flag=true;
                    break;
                }
            }
            /* ==========output========== */
            System.out.println(flag?"Impossible":"Possible");
        }
        br.close();
    }
}