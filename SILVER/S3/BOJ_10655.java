// BOJ_10655_마라톤 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10655 {
    static class Point{
        int x,y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Point[] points = new Point[N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points[i]=new Point(x,y);
        }
        /* ==========sol========== */
        int[] dis = new int[N-1];
        int sum = 0;
        for(int i=0;i<N-1;i++){
            dis[i]=Math.abs(points[i+1].x-points[i].x)+Math.abs(points[i+1].y-points[i].y);
            sum+=dis[i];
        }
        int max = 0;
        for(int i=0;i<N-2;i++){
            int temp = Math.abs(points[i+2].x-points[i].x)+Math.abs(points[i+2].y-points[i].y);
            max=Math.max(max,dis[i]+dis[i+1]-temp);
        }
        /* ==========output========== */
        System.out.println(sum-max);
        br.close();
    }
}