package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n*(n+1) / 2;
        System.out.println(sum);
    }
}
