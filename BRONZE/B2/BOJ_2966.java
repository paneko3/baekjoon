// BOJ_2966_찍기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2966 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String answer = br.readLine();
        /* ==========sol========== */
        String[] name = {"Adrian","Bruno","Goran"};
        int[] point = new int[3];
        int max = 0;
        for(int i=0;i<answer.length();i++){
            if(answer.charAt(i)=='A'+(i%3)){
                point[0]++;
            }
            if(i%2==0){
                if(answer.charAt(i)=='B'){
                    point[1]++;
                }
            }else {
                if((i/2)%2==0&&answer.charAt(i)=='A'){
                    point[1]++;
                } else if((i/2)%2==1&&answer.charAt(i)=='C'){
                    point[1]++;
                }
            }
            if((i/2)%3==0&&answer.charAt(i)=='C'){
                point[2]++;
            }else if((i/2)%3==1&&answer.charAt(i)=='A'){
                point[2]++;
            }else if((i/2)%3==2&&answer.charAt(i)=='B'){
                point[2]++;
            }
            max = Math.max(max,Math.max(point[0],Math.max(point[1],point[2])));
        }
        System.out.println(max);
        for(int i=0;i<3;i++){
            if(point[i]==max){
                System.out.println(name[i]);
            }
        }
        /* ==========output========== */
        br.close();
    }
}