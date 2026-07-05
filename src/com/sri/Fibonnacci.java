package com.sri;

import java.util.Scanner;

public class Fibonnacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;

        while (count <= n){
            int temp = i;
            i = i + p;
            p = temp;
            count++;

        }
        System.out.println(i);

        /*
        package com.sri;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = in.nextInt();

        int p = 0;
        int i = 1;
        int count = 2;

        // 1. Print the first two starting numbers upfront
        if (n >= 1) {
            System.out.print(p);
        }
        if (n >= 2) {
            System.out.print(", " + i);
        }

        // 2. Loop calculates and prints each subsequent number
        while (count < n) {
            int temp = i;
            i = i + p;
            p = temp;

            System.out.print(", " + i); // Prints the current number inline
            count++;
        }
        System.out.println(); // Moves to a new line at the end
    }
}

         */

    }
}
