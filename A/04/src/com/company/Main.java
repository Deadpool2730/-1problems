package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int nl = n%10;
        int ml = m%10;
        int sum = nl+ml;
        System.out.println(sum);
    }
}
