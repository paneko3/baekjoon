// BOJ_5052_전화번호 목록

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_5052 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        LOOP: for(int test_case=1;test_case<=t;test_case++){
            int n = Integer.parseInt(br.readLine());
            String[] numbers = new String[n];
            for(int i=0;i<n;i++){
                numbers[i]=br.readLine();
            }
            /* ==========sol========== */
            Arrays.sort(numbers);
            /* ==========output========== */
            for(int i=0;i<n-1;i++){
                if(numbers[i+1].startsWith(numbers[i])){
                    System.out.println("NO");
                    continue LOOP;
                }
            }
            System.out.println("YES");
        }
        br.close();
    }
}
