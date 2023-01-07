// BOJ_2529_부등호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_2529 {
    static int k;
    static char[] array;
    static boolean[] checked;
    static ArrayList<String> list;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        array = new char[k];
        checked = new boolean[10];
        list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<k;i++){
            array[i] = st.nextToken().charAt(0);
        }
        /* ==========sol========== */
        dfs(0,"");
        Collections.sort(list);
        /* ==========output========== */
        System.out.println(list.get(list.size() -1));
        System.out.println(list.get(0));
        br.close();
    }
    static void dfs(int count, String str){
        if(count==k+1){
            list.add(str);
            return;
        }
        for(int i=0;i<10;i++){
            if(count == 0 || !checked[i]&& compare(str.charAt(str.length()-1)-'0', i, array[count -1 ])){
                checked[i] = true;
                dfs(count+1,str + i);
                checked[i]=false;
            }
        }
    }
    static boolean compare(int a, int b, char c){
        if(c == '<'){
            return a < b;
        }else {
            return a > b;
        }
    }
}
