// BOJ_4493_가위 바위 보?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4493 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            /* ==========sol========== */
            int count1 = 0;
            int count2 = 0;
            for(int j=0;j<n;j++){
                st = new StringTokenizer(br.readLine());
                char p1 = st.nextToken().charAt(0);
                char p2 = st.nextToken().charAt(0);
                if(p1=='R'){
                    if(p2=='S'){
                        count1++;
                    }else if(p2=='P'){
                        count2++;
                    }
                }else if(p1=='S'){
                    if(p2=='R'){
                        count2++;
                    }else if(p2=='P'){
                        count1++;
                    }
                }else if(p1=='P'){
                    if(p2=='S'){
                        count2++;
                    }else if(p2=='R'){
                        count1++;
                    }
                }
            }
            /* ==========output========== */
            System.out.println(count1==count2?"TIE":count1>count2?"Player 1":"Player 2");
        }
        br.close();
    }
}