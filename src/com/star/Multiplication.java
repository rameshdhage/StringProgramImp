package com.star;

public class Multiplication {
	public static void main(String[] args) {
		int num=3;
		
		for(int i=1;i<=100;i++) {
			int mul=3*i;
			
			if(mul%9==0) {
				System.out.println(0);
			}
			else {
				System.out.println("3 *" +i+ "=" +mul);
			}
		}
		
	}

}
