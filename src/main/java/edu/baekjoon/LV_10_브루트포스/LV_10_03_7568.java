package edu.baekjoon.LV_10_브루트포스;

import java.util.Scanner;

public class LV_10_03_7568 {

    public static void main(String[] args) {
        
        LV_10_03_7568 sol = new LV_10_03_7568();
        sol.solution();
        
    }

    public void solution(){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){
            arr[i][0] = sc.nextInt();   // 몸무게
            arr[i][1] = sc.nextInt();   // 키
        }
        
        sc.close();

        for(int i = 0; i < arr.length; i++){
            
            int rank = 1;
            
            for(int j = 0; j < arr.length; j++){
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    rank++;
                }
            }

            System.out.print(rank + " ");
        }
    }
}
