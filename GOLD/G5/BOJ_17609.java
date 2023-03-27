// BOJ_17609_회문

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            int left = 0;
            int right = str.length() - 1;
            /* ==========output========== */
            if(check1(str, left, right)){
                System.out.println(0);
                continue;
            }
            if(check2(str, left, right)){
                System.out.println(1);
                continue;
            }
            System.out.println(2);
        }
        br.close();
    }
    static boolean check1(String str, int left, int right){
        while (left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    static boolean check2(String str, int left, int right){
        while (left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                boolean a = check1(str, left+1,right);
                boolean b = check1(str, left,right-1);
                if(!a && !b){
                    return false;
                }
                return true;
            }
            left++;
            right--;
        }
        return true;
    }
}
