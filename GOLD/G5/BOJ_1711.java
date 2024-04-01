// BOJ_1711_직각삼각형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1711 {
    static class Point{
        long x,y;
        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
    static Point[] points;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        points = new Point[N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            points[i]=new Point(x,y);
        }
        /* ==========sol========== */
        long result = 0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int k=j+1;k<N;k++){
                    long x1 = points[i].x;
                    long y1 = points[i].y;
                    long x2 = points[j].x;
                    long y2 = points[j].y;
                    long x3 = points[k].x;
                    long y3 = points[k].y;
                    long dist1 = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
                    long dist2 = (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3);
                    long dist3 = (x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3);
                    if (dist1 + dist2 == dist3 || dist1 + dist3 == dist2 || dist2 + dist3 == dist1) {
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