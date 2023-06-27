// BOJ_3047_ABC

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_3047 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[3];
        for(int i=0;i<3;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        String str = br.readLine();
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'){
                System.out.print(num[0]+" ");
            }else if(str.charAt(i)=='B'){
                System.out.print(num[1]+" ");
            }else if(str.charAt(i)=='C'){
                System.out.print(num[2]+" ");
            }
        }
        br.close();
    }
}