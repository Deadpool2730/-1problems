package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x+y;
        int mul = x*y;
        int sub = x-y;

        System.out.println( x + "+" + y + "="+ sum);
        System.out.println( x + "*" + y + "="+ mul);
        System.out.println( x + "-" + y + "="+ sub);

    }
}
