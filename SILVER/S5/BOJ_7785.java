// BOJ_7785_회사에 있는 사람

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_7785 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        HashMap<String,Boolean> map = new HashMap<>();
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String type = st.nextToken();
            if(type.equals("enter")){
                map.put(name, true);
            }else {
                map.put(name, false);
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (String name : map.keySet()){
            if(map.get(name)){
                list.add(name);
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        /* ==========output========== */
        for(String name : list){
            System.out.println(name);
        }
        br.close();
    }
}
