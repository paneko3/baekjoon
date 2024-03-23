// BOJ_4641_Doubles

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4641 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true){
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            if(str.equals("-1")){
                break;
            }
            st = new StringTokenizer(str);
            int len = st.countTokens()-1;
            int[] arr = new int[len];
            for(int i=0;i<len;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            int result = 0;
            for(int i=0;i<len;i++){
                for(int j=0;j<len;j++){
                    if(arr[i]*2==arr[j]){
                        result++;
                    }
                }
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}