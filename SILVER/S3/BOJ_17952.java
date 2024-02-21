// BOJ_17952_과제는 끝나지 않아!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_17952 {
    static class Work{
        int A,T;
        public Work(int a, int t) {
            A = a;
            T = t;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 0;
        Stack<Work> stack = new Stack<>();
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            if(type==0){
                if(!stack.isEmpty()){
                    Work now = stack.pop();
                    if(now.T==1){
                        result+=now.A;
                    }else {
                        now.T=now.T-1;
                        stack.push(now);
                    }
                }
                continue;
            }
            int A = Integer.parseInt(st.nextToken());
            int T = Integer.parseInt(st.nextToken());
            if(T==1){
                result+=A;
            }else {
                stack.push(new Work(A,T-1));
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}