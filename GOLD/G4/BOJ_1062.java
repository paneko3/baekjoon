// BOJ_1062_가르침

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1062 {
    static int N,K,flag,max;
    static String[] words;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N =Integer.parseInt(st.nextToken());
        K =Integer.parseInt(st.nextToken());
        words=new String[N];
        if(K<5){
            System.out.println(0);
            return;
        }else if(K>=26){
            System.out.println(N);
            return;
        }else {
            for(int i=0;i<N;i++){
                String temp = br.readLine();
                words[i]=temp.substring(4,temp.length()-4);
            }
            flag=0;
            max=0;
            flag |=1 <<('a'-'a');
            flag |=1 <<('n'-'a');
            flag |=1 <<('t'-'a');
            flag |=1 <<('i'-'a');
            flag |=1 <<('c'-'a');
        }
        /* ==========output========== */
        com(0,0,flag);
        System.out.println(max);
        br.close();
    }
    static void com(int index,int start,int flag){
        if(index==K-5){
            int count=0;
            for(int i=0;i<N;i++){
                boolean isValid=true;
                for(int j=0;j< words[i].length();j++){
                    if((flag&1<<(words[i].charAt(j)-'a'))==0){
                        isValid=false;
                        break;
                    }
                }
                if(isValid){
                    count++;
                }
            }
            max=Math.max(max,count);
            return;
        }
        for(int i=start;i<26;i++){
            if((flag&1<<i)!=0) continue;
            com(index+1,i+1,flag|1<<i);
        }
    }
}
