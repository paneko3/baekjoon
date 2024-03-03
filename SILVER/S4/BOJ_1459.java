// BOJ_1459_걷기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1459 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long X = Long.parseLong(st.nextToken());
        long Y = Long.parseLong(st.nextToken());
        long W = Long.parseLong(st.nextToken());
        long S = Long.parseLong(st.nextToken());
        /* ==========sol========== */
        long move1 = (X+Y)*W;
        long move2;
        if((X+Y) % 2 == 0) {
            move2 = Math.max(X,Y)*S;
        }
        else {
            move2 = (Math.max(X,Y)-1)*S+W;
        }
        long move3 = (Math.min(X,Y)*S)+(Math.abs(X-Y)*W);
        /* ==========output========== */
        System.out.println(Math.min(Math.min(move1, move2), move3));
        br.close();
    }
}