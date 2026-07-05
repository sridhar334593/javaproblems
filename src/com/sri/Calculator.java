package com.sri;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or x
        while(true){
            System.out.println("enter operator: ");

            char op = in.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                System.out.println("Exiting calculator:");
                break;
            }



            if (op == '+' || op == '-' || op =='*' || op == '/' || op == '%'){
                // input 2 num
                System.out.println("enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                int ans = 0;
                if (op == '+'){
                    ans = num1 +num2;
                }
                else if (op =='-'){
                    ans = num1-num2;
                }
                else if (op == '*'){
                    ans = num1*num2;
                }
                else if (op == '/'){
                    if(num2 != 0){
                    ans = num1/num2;
                }
                    else {
                        System.out.println("error by division");
                        continue;
                    }
                }
                else if (op == '%'){
                    ans = num1%num2;
                }
                System.out.println("result: " + ans);
                System.out.println();
                }

                else{
                    System.out.println("Invalid operation");
                System.out.println();
                }

            }
        in.close();

        }

    }

