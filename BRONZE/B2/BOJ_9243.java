// BOJ_9243_파일 완전 삭제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9243 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str1 = br.readLine();
        String str2 = br.readLine();
        /* ==========sol========== */
        /* ==========output========== */
        if(N%2==0){
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)!=str2.charAt(i)){
                    System.out.println("Deletion failed");
                    return;
                }
            }
        }else {
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)==str2.charAt(i)){
                    System.out.println("Deletion failed");
                    return;
                }
            }
        }
        System.out.println("Deletion succeeded");
        br.close();
    }
}