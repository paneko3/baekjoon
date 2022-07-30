// BOJ_2174_로봇 시뮬레이션

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2174 {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static class Node {
        int a, b, c;

        public Node(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Node[] robots = new Node[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = st.nextToken().charAt(0);
            if (c == 'E') c = 0;
            else if (c == 'N') c = 1;
            else if (c == 'W') c = 2;
            else if (c == 'S') c = 3;
            robots[i] = new Node(a, b, c);
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = st.nextToken().charAt(0);
            int c = Integer.parseInt(st.nextToken());
            if (b == 'L') {
                for(int k=0;k<c;k++) {
                    robots[a].c = (robots[a].c + 1) % 4;
                }
            } else if (b == 'R') {
                for(int k=0;k<c;k++) {
                    robots[a].c = (robots[a].c - 1) == -1 ? 3 : robots[a].c - 1;
                }
            } else if (b == 'F'){
                for (int k = 0; k < c; k++) {
                    int row = robots[a].a + dx[robots[a].c];
                    int col = robots[a].b + dy[robots[a].c];
                    if (row < 1 || row > A || col < 1 || col > B) {
                        System.out.println("Robot " + (a + 1) + " crashes into the wall");
                        System.exit(0);
                    }
                    robots[a].a = row;
                    robots[a].b = col;
                    for (int j = 0; j < N; j++) {
                        if (j == (a)) continue;
                        if (robots[a].a == robots[j].a && robots[a].b == robots[j].b) {
                            System.out.println("Robot " + (a + 1) + " crashes into robot " + (j + 1));
                            System.exit(0);
                        }
                    }
                }
            }
        }
        /* ==========output========== */
        System.out.println("OK");
        br.close();
    }
}
