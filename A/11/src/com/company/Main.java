package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        char X = sc.next().charAt(0);
        if (X >= 65 && X <= 90){
            System.out.println("ALPHABET");
            System.out.println("IS CAPITAL");

        }else if(X >= 97 && X <= 122){
            System.out.println("ALPHABET");
            System.out.println("IS SMALL");

        }else{
            System.out.println("IS DIGIT");

        }
    }
}
