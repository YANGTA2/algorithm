package edu.baekjoon.LV_03_반복문;

import java.util.Scanner;

public class LV_03_14_1110 {

    public static void main(String[] args) {
        
        LV_03_14_1110 sol = new LV_03_14_1110();
        sol.solution();
        
    }

    private void solution() {

        Scanner sc = new Scanner(System.in);

        double insert = sc.nextInt();
        sc.close();
        double result = -1;
        double temp = insert;
        int a = 0;
        int cnt = 0;

        while(insert != result){
            // result = insert;
            if(temp < 10){
                int x = a;
                int y = (int)((temp/10 - (int)temp/10)*10+0.1);

                Double plus = (double)(x + y);
                temp = Double.parseDouble(y + "" + ((plus/10 - (int)(plus/10))*10));
                result = temp;
                cnt++;

            } else {
                int x = (int)temp/10;
                int y = (int)((temp/10 - (int)temp/10)*10+0.1);

                Double plus = (double)(x + y);
                temp = Double.parseDouble(y + "" + ((plus/10 - (int)(plus/10))*10));
                result = temp;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}