// BOJ_13417_카드 문자열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ_13417 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        /* ==========sol========== */
        for(int t=0;t<T;t++){
            int N = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");
            Deque<Character> deque = new ArrayDeque<>();
            for(int i=0;i<arr.length;i++){
                char c = arr[i].charAt(0);
                if(deque.isEmpty()){
                    deque.add(c);
                }else {
                    if(deque.getFirst()>=c){
                        deque.addFirst(c);
                    }else {
                        deque.addLast(c);
                    }
                }
            }
            for(char c : deque){
                sb.append(c);
            }
            sb.append("\n");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}