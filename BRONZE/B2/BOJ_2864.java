// BOJ_2864_5와 6의 차이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2864 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        /* ==========sol========== */
        String maxA = "";
        String maxB = "";
        String minA = "";
        String minB = "";
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='5'|| A.charAt(i)=='6'){
                minA +="5";
                maxA +="6";
            }else {
                minA +=A.charAt(i);
                maxA +=A.charAt(i);
            }
        }
        for(int i=0;i<B.length();i++){
            if(B.charAt(i)=='5'|| B.charAt(i)=='6'){
                minB +="5";
                maxB +="6";
            }else {
                minB +=B.charAt(i);
                maxB +=B.charAt(i);
            }
        }
        /* ==========output========== */
        System.out.println((Integer.parseInt(minA)+Integer.parseInt(minB))+" "+(Integer.parseInt(maxA)+Integer.parseInt(maxB)));
        br.close();
    }
}
