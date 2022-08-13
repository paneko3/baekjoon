// BOJ_1063_킹

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1063 {
     static List<String> list = Arrays.asList("R","L","B","T","RT","LT","RB","LB");
     static int[] dx= {0,0,-1,1,1,1,-1,-1};
     static int[] dy= {1,-1,0,0,1,-1,1,-1};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String king = st.nextToken();
        String pawn = st.nextToken();
        int N =Integer.parseInt(st.nextToken());
        char kingX = king.charAt(1);
        char kingY = king.charAt(0);
        char pawnX = pawn.charAt(1);
        char pawnY = pawn.charAt(0);
        for(int i=0;i<N;i++){
            String move = br.readLine();
            int dir = list.indexOf(move);
            int row =kingX +dx[dir];
            int col =kingY +dy[dir];
            if(row>'8'||row<'1'||col>'H'||col<'A') continue;
            if(row==pawnX&&col==pawnY){
                int nr =row +dx[dir];
                int nc =col +dy[dir];
                if(nr>'8'||nr<'1'||nc>'H'||nc<'A') continue;
                kingX=(char)row;
                kingY=(char)col;
                pawnX=(char)nr;
                pawnY=(char)nc;
            }else {
                kingX=(char)row;
                kingY=(char)col;
            }

        }
        System.out.print(kingY);
        System.out.println(kingX);
        System.out.print(pawnY);
        System.out.print(pawnX);
        /* ==========sol========== */
        /* ==========output========== */
        br.close();
    }
}
