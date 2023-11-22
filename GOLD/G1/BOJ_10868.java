// BOJ_10868_최솟값

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10868 {
    static int[] arr, minTree;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N+1];
        minTree = new int[4*N];
        for(int i=1;i<=N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        init(1,N,1);
        /* ==========output========== */
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            System.out.println(find(1,N,1,left,right));
        }
        br.close();
    }
    static int init(int start, int end, int node){
        if(start == end){
            return minTree[node] = arr[start];
        }
        int mid = (start+end)/2;
        return minTree[node] = Math.min(init(start,mid,node*2),init(mid+1,end,node*2+1));
    }
    static int find(int start, int end, int node, int left, int right){
        if(right<start||end<left){
            return Integer.MAX_VALUE;
        }
        if(left<=start &&end<=right){
            return minTree[node];
        }
        int mid = (start+end)/2;
        return Math.min(find(start,mid,node*2,left,right),find(mid+1,end,node*2+1,left,right));
    }
}