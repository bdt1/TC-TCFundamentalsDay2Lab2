package io.zipcoder.fundamentals.day2;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args){
    	Scanner stdin = new Scanner(System.in);
    	int n;  	
    	System.out.print("Please enter a number to be added to 1: ");
    	n = stdin.nextInt();
    	System.out.print(1 + n);
    	stdin.close();
    }
}
