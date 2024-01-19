// BOJ_6321_IBM 빼기 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_6321 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            /* ==========output========== */
            System.out.println("String #"+i);
            for(int j=0;j<str.length();j++){
                System.out.print(str.charAt(j)=='Z'?'A':(char)(str.charAt(j)+1));
            }
            System.out.println();
            System.out.println();
        }
        br.close();
    }
}