package com.company;

import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.Math.min;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int v = Math.min(a,b);
        int i = Math.min(v,c);
        int x = Math.max(a,b);
        int z = Math.max(x,c);

        System.out.println(i+" "+z);
    }
}
