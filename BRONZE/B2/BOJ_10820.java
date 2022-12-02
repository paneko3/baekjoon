// BOJ_10820_문자열 분석

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10820 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        for(int i=0;i<100;i++){
            if((str=br.readLine()) ==null){
                break;
            }
            int result1=0;
            int result2=0;
            int result3=0;
            int result4=0;
            for(int j=0;j<str.length();j++){
                char temp = str.charAt(j);
                if(temp>='a'&&temp<='z'){
                    result1++;
                }else if(temp>='A'&&temp<='Z'){
                    result2++;
                }else if(temp>='0'&&temp<='9'){
                    result3++;
                }else if(temp==' '||temp=='\t'){
                    result4++;
                }
            }
            System.out.println(result1+" "+result2+" "+result3+" " +result4);
        }
        /* ==========output========== */
        br.close();
    }
}
