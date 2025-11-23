// BOJ_14620_꽃길

import java.io.*;
import java.util.*;

public class BOJ_14620 {
    static int N;
    static int[][] garden;
    static int MIN_COST = Integer.MAX_VALUE;

    static int[] dr = {0, -1, 1, 0, 0};
    static int[] dc = {0, 0, 0, -1, 1};

    private static int getCost(int r, int c, boolean[][] occupied) {
        int cost = 0;
        
        for (int i = 0; i < 5; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            
            if (occupied[nr][nc]) {
                return -1;
            }
            
            cost += garden[nr][nc];
        }
        
        for (int i = 0; i < 5; i++) {
            occupied[r + dr[i]][c + dc[i]] = true;
        }
        
        return cost;
    }

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        garden = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                garden[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        /* ==========sol========== */
        
        int limit = N - 1; 

        for (int r1 = 1; r1 < limit; r1++) {
            for (int c1 = 1; c1 < limit; c1++) {
                
                for (int r2 = 1; r2 < limit; r2++) {
                    for (int c2 = 1; c2 < limit; c2++) {
                        
                        for (int r3 = 1; r3 < limit; r3++) {
                            for (int c3 = 1; c3 < limit; c3++) {
                                
                                if ((r1 == r2 && c1 == c2) || (r1 == r3 && c1 == c3) || (r2 == r3 && c2 == c3)) {
                                    continue;
                                }

                                boolean[][] occupied = new boolean[N][N];
                                int currentCost = 0;
                                
                                int cost1 = getCost(r1, c1, occupied);
                                if (cost1 == -1) continue; 
                                currentCost += cost1;

                                int cost2 = getCost(r2, c2, occupied);
                                if (cost2 == -1) continue;
                                currentCost += cost2;

                                int cost3 = getCost(r3, c3, occupied);
                                if (cost3 == -1) continue;
                                currentCost += cost3;
                                
                                MIN_COST = Math.min(MIN_COST, currentCost);
                            }
                        }
                    }
                }
            }
        }

        /* ==========output========== */
        System.out.println(MIN_COST);
        br.close();
    }
}
