// BOJ_2822_점수 계산

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BOJ_2822 {
    static class Node implements Comparable<Node>{
        int idx,num;
        public Node(int idx, int num) {
            this.idx = idx;
            this.num = num;
        }
        @Override
        public int compareTo(Node o) {
            return this.num - o.num;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node[] nodes = new Node[8];
        ArrayList<Integer> list = new ArrayList<>();
        int result=0;
        for(int i=0;i<8;i++){
            nodes[i]=new Node(i+1,Integer.parseInt(br.readLine()));
        }
        /* ==========sol========== */
        Arrays.sort(nodes);
        for(int i=7;i>=3;i--){
            list.add(nodes[i].idx);
            result+=nodes[i].num;
        }
        Collections.sort(list);
        /* ==========output========== */
        System.out.println(result);
        for(int i=0;i<5;i++){
            System.out.print(list.get(i)+ " ");
        }
        br.close();
    }
}
