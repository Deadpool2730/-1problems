package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        float output3 = (float) a/b;

        System.out.println((int)Math.ceil(output3));
//        System.out.println("floor"+  a +"/"+ b + "=" +  Math.floor(output));
//        System.out.println("ceil"+  a +"/"+ b + "=" + Math.ceil(output2));
//        System.out.println("round"+  a +"/"+b + "=" + Math.round(output3));


    }
}
