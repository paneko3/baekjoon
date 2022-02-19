// BFSDFS_boj_2178_JJC

import java.util.*;
import java.io.*;

public class BFSDFS_boj_2178_JJC {
    static int n, m;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };

    static class Node{
        int x;
        int y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited= new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        bfs(0,0);

        System.out.println(map[n-1][m-1]);
        br.close();
    }

    static void bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(new Node(x, y));
        visited[x][y]=true;

        while(!queue.isEmpty()){
            Node node = queue.poll();
            for(int dir=0;dir<4;dir++){
                int nextR = node.x+dx[dir];
                int nextC = node.y+dy[dir];
                if(nextR<0||nextR>=n||nextC<0||nextC>=m||map[nextR][nextC]==0||visited[nextR][nextC] )continue;
                queue.add(new Node(nextR, nextC));
                map[nextR][nextC] = map[node.x][node.y]+1;
                visited[nextR][nextC]=true;
            }
        }
    }
}