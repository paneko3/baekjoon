// BOJ_1543_문서 검색

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1543 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        /* ==========sol========== */
        int result=0;
        int idx = 0;
        while (idx<A.length()){
            if(A.charAt(idx)==B.charAt(0)){
                if(idx+B.length()<=A.length()){
                    String temp = A.substring(idx,idx+B.length());
                    if(B.equals(temp)){
                        result++;
                        idx+=B.length();
                    }else {
                        idx++;
                    }
                }else {
                    idx++;
                }
            }else {
                idx++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
