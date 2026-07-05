package com.sri;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        Scanner i =new Scanner(System.in);
        System.out.println("உங்கள் சம்பளத்தை உள்ளிடவும்: ");
        int salary = i.nextInt();

        if(salary<=10000){
            salary=salary+2000;
        }

        else if (salary>20000) {
            salary +=3000;   //salary=salary+3000

        } else{
            salary=salary+1000;
        }
        System.out.println("சம்பளம் உயர்வு " +salary);

    }
}