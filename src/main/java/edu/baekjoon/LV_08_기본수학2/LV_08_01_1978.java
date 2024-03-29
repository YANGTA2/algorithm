package edu.baekjoon.LV_08_기본수학2;

import java.util.Arrays;
import java.util.Scanner;

public class LV_08_01_1978 {
    
    public static void main(String[] args) {
        
        LV_08_01_1978 sol = new LV_08_01_1978();
        sol.solution();
    }
    
    public void solution(){
        
        Scanner sc = new Scanner(System.in);

        boolean[] primeNum = new boolean[1001];
        Arrays.fill(primeNum, true);
        primeNum[1] = false;

        for(int i = 2; i < 1001; i++){
            int cnt = 2;
            while(i * cnt < 1001){
                int num = i*cnt;
                primeNum[num] = false;
                cnt++;
            }
        }

        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(primeNum[num] == true){
                cnt++;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}
