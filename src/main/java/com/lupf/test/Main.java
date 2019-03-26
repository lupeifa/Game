package com.lupf.test;

import java.util.Scanner;

import com.lupf.util.ContainUtil;
import com.lupf.util.DivideUtil;

public class Main {
	
	public void divide() {
		DivideUtil divideUtil = new DivideUtil();
		divideUtil.divide();
	}
	
	public void contain() {
		ContainUtil containUtil = new ContainUtil();
		containUtil.contain();
	}
	
	public static void main(String[] args) {

		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int val;
		do {
			System.out.println("£¨1£©1-100,it is divisible by 3:Fizz,it is divisible by 5:Buzz,it is divisible by 3 and 5:FizzBuzz.Please enter the number 1.");
			System.out.println("£¨2£©1-100,it is divisible by 3 or has a 3 in it:Fizz,it is divisible by 5 or has a 5 in it:Buzz,it satify above 2 criterias together:FizzBuzz.Please enter the number 2.");
			System.out.println("£¨3£©Finish!Please enter the number 3.");
			System.out.println("Please enter the number:");
			val = sc.nextInt();
			switch(val) {
				case 1:
					System.out.println("Result:");
					main.divide();
					System.out.println("\n");
					break;
				case 2:
					System.out.println("Result:");
					main.contain();
					System.out.println("\n");
					break;
				case 3:
					System.out.println("Finish!");
					System.out.println("\n");
					break;
				default:
					System.out.println("Invalid input!!Please enter the numbers 1, 2, or 3.");
					System.out.println("\n");
					break;
			}
		}while(val != 3);
		
		if(null != sc) {
			sc.close();
		}
	}
}
