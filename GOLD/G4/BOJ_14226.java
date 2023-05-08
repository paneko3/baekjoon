// BOJ_14226_이모티콘

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_14226 {
    static class Node{
        int idx, count, clip;
        public Node(int idx, int count, int clip) {
            this.idx = idx;
            this.count = count;
            this.clip = clip;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        boolean[][] visit = new boolean[1001][1001];
        int result = Integer.MAX_VALUE;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(1,0, 0));
        visit[1][0]=true;
        /* ==========output========== */
        while (!queue.isEmpty()){
            Node node = queue.poll();
            int idx = node.idx;
            int count = node.count;
            int clip = node.clip;
            if(idx==N){
                System.out.println(count);
                return;
            }
            queue.add(new Node(idx,count+1,idx));
            if(idx-1>=2&&!visit[idx-1][clip]){
                queue.add(new Node(idx-1,count+1, clip));
                visit[idx-1][clip]=true;
            }
            if(idx+clip<=1000&&!visit[idx+clip][clip]){
                queue.add(new Node(idx+clip,count+1,clip));
                visit[idx+clip][clip]=true;
            }
        }
        br.close();
    }
}