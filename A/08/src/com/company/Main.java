package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a%b==0){
            System.out.println("Multiples");
        }else{
            System.out.println("No Multiples");
        }
    }
}
