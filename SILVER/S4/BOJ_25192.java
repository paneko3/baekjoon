// BOJ_25192_인사성 밝은 곰곰이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_25192 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        HashSet<String> set = new HashSet<>();
        int result = 0;
        for(int i=0;i<N;i++){
            String str = br.readLine();
            if(str.equals("ENTER")){
                set = new HashSet<>();
            }else {
                if(!set.contains(str)){
                    result++;
                    set.add(str);
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}