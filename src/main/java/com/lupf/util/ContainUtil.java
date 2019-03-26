package com.lupf.util;

public class ContainUtil {

	public void contain() {

		for(int i=1;i<=100;i++) {
			if(i%3==0||i%10==3||i/10==3) {
				if(i%5==0||i%10==5||i/10==5) {
					System.out.println("FizzBuzz");
				}else {
					System.out.println("Fizz");
				}				
			}else if(i%5==0||i%10==5||i/10==5) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}

	}
}
