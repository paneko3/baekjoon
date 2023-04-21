// BOJ_1963_소수 경로

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1963 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] prime = new boolean[10000];
        prime[0]=prime[1]=true;
        for(int i=2;i*i<10000;i++){
            if(!prime[i]){
                for(int j=i*i;j<10000;j+=i){
                    prime[j]=true;
                }
            }
        }
        int T = Integer.parseInt(st.nextToken());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            int result=0;
            Queue<Integer> queue = new LinkedList<>();
            boolean[] visit = new boolean[10000];
            int[] count = new int[10000];
            queue.add(A);
            visit[A]=true;
            while (!queue.isEmpty()){
                int now=queue.poll();
                for(int i=0;i<4;i++){
                    for(int j=0;j<=9;j++){
                        if(i==0&&j==0){
                            continue;
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(now));
                        sb.setCharAt(i,(char)(j+'0'));
                        int num = Integer.parseInt(sb.toString());
                        if(!prime[num]&&!visit[num]){
                            queue.add(num);
                            visit[num]=true;
                            count[num]=count[now]+1;
                        }
                    }
                }
            }
            /* ==========output========== */
            System.out.println(visit[B]?count[B]:"Impossible");
        }
        br.close();
    }
}