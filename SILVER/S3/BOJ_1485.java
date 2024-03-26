// BOJ_1485_정사각형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1485 {
    static class Point {
        int x;
        int y;
        public Point (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            /* ==========input========== */
            ArrayList<Point> pointList = new ArrayList<>();
            for (int j=0; j<4; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y =Integer.parseInt(st.nextToken());
                pointList.add(new Point(x, y));
            }
            /* ==========sol========== */
            double[] len = new double[6];
            int count=0;
            for (int j=0; j<3; j++) {
                for (int k=j+1; k<4; k++) {
                    if (j==0 && k==1) len[count++] = calculateDistance(pointList.get(j), pointList.get(k));
                    else {
                        len[count++] = calculateDistance(pointList.get(j), pointList.get(k));
                    }
                }
            }
            boolean isSquare = true;
            Arrays.sort(len);
            for (int j=1; j<4; j++) {
                if (len[0] != len[j]) isSquare = false;
            }
            if (len[4]!=len[5]) isSquare = false;
            /* ==========output========== */
            if (isSquare){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
        br.close();
    }
    static double calculateDistance(Point point1, Point point2) {
        int dx = point1.x - point2.x;
        int dy = point1.y - point2.y;
        return Math.sqrt(Math.pow(dx, 2)+Math.pow(dy, 2));
    }
}