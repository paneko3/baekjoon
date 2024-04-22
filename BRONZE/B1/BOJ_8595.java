// BOJ_8595_히든 넘버

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8595 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        /* ==========sol========== */
        long result = 0;
        String temp = "";
        for(int i=0;i<n;i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                temp+=str.charAt(i);
            }else {
                if(!temp.equals("")){
                    result+=Integer.parseInt(temp);
                }
                temp = new String("");
            }
        }
        if(!temp.equals("")){
            result+=Integer.parseInt(temp);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}