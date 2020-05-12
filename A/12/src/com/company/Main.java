package com.company;

import java.util.Scanner;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        char X = sc.next().charAt(0);
        if (X >= 65 && X<=90){
            System.out.println(toLowerCase(X));
        }else{
            System.out.println(toUpperCase(X));
        }

    }
}
