// BOJ_1759_암호 만들기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1759 {
    static int L,C;
    static char[] code;
    static char[] input;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L= Integer.parseInt(st.nextToken());
        C= Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        code = new char[L];
        input = new char[C];
        for(int i=0;i<C;i++){
            input[i]= st.nextToken().charAt(0);
        }
        /* ==========sol========== */
        Arrays.sort(input);
        sb= new StringBuilder();
        com(0,0);
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
    static void com(int count, int start){
        if (count == L) {
            int a=0;
            for(int i=0;i<L;i++){
                if(code[i]=='a'||code[i]=='e'||code[i]=='i'||code[i]=='o'||code[i]=='u'){
                    a++;
                }
            }
            if(a>=1&&(code.length-a)>=2){
                for(int i=0;i<L;i++){
                    sb.append(code[i]);
                }
                sb.append("\n");
            }
            return;
        }
        for(int i=start;i<C;i++){
            code[count]=input[i];
            com(count+1,i+1);
        }

    }
}
