package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = (int)Math.log10(x);
        int p = (int)Math.pow(10,t);
        if(x/p % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }
}
