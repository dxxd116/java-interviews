package com.choices;

import java.util.Scanner;

public class SumArray {

    public static void main(String[] args){
        System.out.println("Test main");
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sr.nextInt();
        }
        int q = sr.nextInt();
        int num =0;
        for(int i=0;i<q;i++){
            num+=sr.nextInt();
            long sum =0;
            for(int t:arr){
                sum+=Math.abs(t+num);
            }
            System.out.println(sum);
        }

    }
}
