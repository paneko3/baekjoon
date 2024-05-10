// BOJ_2596_비밀편지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2596 {
    static String[] arr = {"000000","001111","010011","011100","100110","101001","110101","111010"};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        /* ==========sol========== */
        String result = "";
        for(int i=0;i<N;i++){
            String temp = str.substring(6*i,6*(i+1));
            char c='0';
            int max = 0;
            for(int j=0;j<8;j++){
                int count = 0;
                for(int k=0;k<6;k++){
                    if(temp.charAt(k)==arr[j].charAt(k)){
                        count++;
                    }
                }
                max = Math.max(max,count);
                if(count>=5){
                    c=(char)('A'+j);
                    break;
                }
            }
            if(max<=4){
                System.out.println(i+1);
                return;
            }
            result+=c;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}