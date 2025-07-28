// BOJ_20006_랭킹전 대기열

import java.io.*;
import java.util.*;

class Player implements Comparable<Player> {
    int l;
    String n;

    Player(int l, String n) {
        this.l = l;
        this.n = n;
    }

    @Override
    public int compareTo(Player other) {
        return this.n.compareTo(other.n);
    }
}

class Room {
    int minL;
    int maxL;
    List<Player> players;
    int m; // capacity
    boolean isStarted;

    Room(int l, int m) {
        this.minL = l - 10;
        this.maxL = l + 10;
        this.players = new ArrayList<>();
        this.m = m;
        this.isStarted = false;
    }

    void addPlayer(Player player) {
        players.add(player);
        if (players.size() == m) {
            isStarted = true;
        }
    }
}

public class BOJ_20006 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Room> rooms = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            String n = st.nextToken();
            Player player = new Player(l, n);
            /* ==========sol========== */
            boolean entered = false;
            for (Room room : rooms) {
                if (!room.isStarted && l >= room.minL && l <= room.maxL && room.players.size() < room.m) {
                    room.addPlayer(player);
                    entered = true;
                    break;
                }
            }

            if (!entered) {
                Room newRoom = new Room(l, m);
                newRoom.addPlayer(player);
                rooms.add(newRoom);
            }
        }
        /* ==========output========== */
        StringBuilder result = new StringBuilder();
        for (Room room : rooms) {
            Collections.sort(room.players);
            if (room.isStarted) {
                result.append("Started!\n");
            } else {
                result.append("Waiting!\n");
            }
            for (Player player : room.players) {
                result.append(player.l).append(" ").append(player.n).append("\n");
            }
        }
        System.out.print(result);
        br.close();
    }
}
