// BOJ_1339_단어 수학

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1339 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] strings= new String[N];
        for(int i=0;i<N;i++){
            strings[i]= br.readLine();
        }
        /* ==========sol========== */
        int[] alpha =new int[26];
        for(int i=0;i<N;i++){
            for(int j=0;j<strings[i].length();j++){
                alpha[strings[i].charAt(j) - 'A']+= Math.pow(10, strings[i].length()-1-j);
            }
        }
        Arrays.sort(alpha);
        int result=0;
        for(int i=25;i>16;i--){
            result+=alpha[i]*(i-16);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }

}
