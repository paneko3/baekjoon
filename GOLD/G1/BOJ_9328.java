// BOJ_9328_열쇠

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_9328 {
    static int h,w,result;
    static boolean[][] check;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static class Node{
        int x,y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            char[][] map = new char[h][w];
            check = new boolean[h][w];
            for(int i=0;i<h;i++){
                String str = br.readLine();
                for(int j=0;j<w;j++){
                    map[i][j] = str.charAt(j);
                }
            }
            String key = br.readLine();
            /* ==========sol========== */
            boolean[] keys = new boolean[26];
            if(!key.equals("0")){
                for(int a=0;a<key.length();a++){
                    char c = key.charAt(a);
                    keys[c-'a']=true;
                }
            }
            String temp = new String();
            String prev = new String();
            result=0;
            for (int k = 0; k < 26; k++) {
                if (keys[k]) {
                    temp += (char) ('a' + k);
                }
            }
            while (true) {
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        if ((i == 0 || i == h - 1 || j == 0 || j == w - 1) && map[i][j] != '*') {

                            bfs(i, j, map, keys);
                        }
                    }
                }
                temp = new String();
                for (int k = 0; k < 26; k++) {
                    if (keys[k]) {
                        temp += (char) ('a' + k);
                    }
                }
                if(temp.equals(prev)){
                    break;
                }
                prev = new String(temp);
            }
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(check[i][j]){
                        result++;
                    }
                }
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
    static void bfs(int i, int j, char[][] map,boolean[] keys){
        boolean[][] visit = new boolean[h][w];
        Queue<Node> queue = new LinkedList<>();
        char start = map[i][j];
        if(start>='a'&&start<='z'){
            keys[start-'a']=true;
            map[i][j]='.';
        }else if(start>='A'&&start<='Z'){
            if(!keys[start-'A']){
                return;
            }
        }else if(start=='$'){
            check[i][j]=true;
        }
        queue.add(new Node(i,j));
        visit[i][j]=true;
        while (!queue.isEmpty()){
            Node now = queue.poll();
            for(int dir=0;dir<4;dir++){
                int r = now.x + dx[dir];
                int c = now.y + dy[dir];
                if(r<0||r>=h||c<0||c>=w||visit[r][c]){
                    continue;
                }
                char next = map[r][c];
                if(next=='.'){
                    visit[r][c]=true;
                    queue.add(new Node(r,c));
                }else if(next=='$'){
                    check[r][c]=true;
                    visit = new boolean[h][w];
                    visit[r][c]=true;
                    map[r][c]='.';
                    queue.add(new Node(r,c));
                }else if(next>='A'&&next<='Z'){
                    if(keys[next-'A']){
                        visit = new boolean[h][w];
                        visit[r][c]=true;
                        map[r][c]='.';
                        queue.add(new Node(r,c));
                    }
                }else if(next>='a'&&next<='z'){
                    keys[next-'a']=true;
                    visit = new boolean[h][w];
                    visit[r][c]=true;
                    map[r][c]='.';
                    queue.add(new Node(r,c));
                }
            }
        }
    }
}