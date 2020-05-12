package com.company;

import java.util.Scanner;

public class Main {
    private static char S;

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        char S = sc.next().charAt(0);
//        int B = sc.nextInt();
////        String str = "7+55"
//        if (S == '+'){
//            System.out.println(A + B);
//        }else if (S == '-'){
//            System.out.println(A - B);
//        }else if (S == '*'){
//            System.out.println(A * B);
//        }else {
//            System.out.println(A / B);
//
//       }
        String str = sc.next();
        int index = str.indexOf("+");
        if (index!=-1)
        System.out.println(Integer.parseInt(str.substring(0,index))+Integer.parseInt(str.substring(index+1,(str.length()))));
        else {
            index = str.indexOf("-");
            if (index!=-1)
            System.out.println(Integer.parseInt(str.substring(0,index))-Integer.parseInt(str.substring(index+1,(str.length()))));
            else {
                index = str.indexOf("*");
                if (index!=-1)
                System.out.println(Integer.parseInt(str.substring(0,index))*Integer.parseInt(str.substring(index+1,(str.length()))));
                else{
                    index = str.indexOf("/");
                    System.out.println(Integer.parseInt(str.substring(0,index))/Integer.parseInt(str.substring(index+1,(str.length()))));
                }
            }

        }


    }
}
