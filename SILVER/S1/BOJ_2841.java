// BOJ_2841_외계인의 기타 연주

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_2841 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int result=0;
        Stack<Integer>[] stacks = new Stack[7];
        for(int i=1;i<=6;i++){
            stacks[i]=new Stack<>();
        }
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int line = Integer.parseInt(st.nextToken());
            int flat = Integer.parseInt(st.nextToken());
            if(stacks[line].isEmpty()){
                stacks[line].push(flat);
                result++;
            }else {
                if(stacks[line].peek()<flat){
                    stacks[line].push(flat);
                    result++;
                }else {
                    while (!stacks[line].isEmpty()&&stacks[line].peek()>flat){
                        stacks[line].pop();
                        result++;
                    }
                    if(stacks[line].isEmpty()||stacks[line].peek()!=flat){
                        stacks[line].push(flat);
                        result++;
                    }
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}