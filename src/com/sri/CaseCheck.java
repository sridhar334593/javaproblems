package com.sri;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a char : ");

        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("it is lowercase");
        }
        else {
            System.out.println("it is uppercase");
        }

        System.out.println(ch);
    }
}
