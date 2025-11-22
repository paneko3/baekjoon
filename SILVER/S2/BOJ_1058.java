// BOJ_1058_친구

import java.io.*;
import java.util.*;

public class BOJ_1058 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        boolean[][] isFriend = new boolean[N][N];
        
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                if (line.charAt(j) == 'Y') {
                    isFriend[i][j] = true;
                }
            }
        }

        /* ==========sol========== */
        
        int maxTwoFriends = 0;
        
        for (int i = 0; i < N; i++) {
            boolean[] isTwoFriend = new boolean[N];
            int currentTwoFriendCount = 0;
            
            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                if (isFriend[i][j]) {
                    isTwoFriend[j] = true;
                    continue; 
                }

                for (int k = 0; k < N; k++) {
                    if (isFriend[i][k] && isFriend[k][j]) {
                        isTwoFriend[j] = true;
                        break;
                    }
                }
            }
            
            for (int j = 0; j < N; j++) {
                if (isTwoFriend[j]) {
                    currentTwoFriendCount++;
                }
            }
            
            maxTwoFriends = Math.max(maxTwoFriends, currentTwoFriendCount);
        }

        /* ==========output========== */
        System.out.println(maxTwoFriends);
        br.close();
    }
}
