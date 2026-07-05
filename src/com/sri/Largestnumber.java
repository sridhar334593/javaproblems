package com.sri;

import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 3 numbers: ");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q: find largest of 3 numbers
        int max = a;
        if(b > max) {
            max = b;
        }

        if(c > max){
            max = c;
        }

        System.out.println(max + " is the max number");
    }
}
