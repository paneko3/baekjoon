// BOJ_2745_진법 변환

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2745 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result=0;
        for(int i=N.length()-1;i>=0;i--){
            char c = N.charAt(i);
            if(c>='A'&&c<='Z'){
                result+=(int)(c-'A'+10)*Math.pow(B,(N.length()-1)-i);
            }else {
                result+=(int)(c-'0')*Math.pow(B,(N.length()-1)-i);
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
