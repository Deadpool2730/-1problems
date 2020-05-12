package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(),d = sc.nextInt();
        int x = (a*b) - (c*d);
        System.out.println(x);

    }
}
