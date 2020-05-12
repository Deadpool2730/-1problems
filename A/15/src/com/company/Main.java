package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 7;
        boolean ans = true;
        for(int i=2;i<n;i++){
            if(i%n == 0){
                ans = false;
            }
        }
        System.out.println(ans);
    }
}
