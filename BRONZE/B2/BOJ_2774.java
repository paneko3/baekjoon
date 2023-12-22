// BOJ_2774_아름다운 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_2774 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            /* ==========input========== */
            String X = br.readLine();
            /* ==========sol========== */
            HashSet<Character> set = new HashSet<>();
            for(int i=0;i<X.length();i++){
                set.add(X.charAt(i));
            }
            /* ==========output========== */
            System.out.println(set.size());
        }
        br.close();
    }
}