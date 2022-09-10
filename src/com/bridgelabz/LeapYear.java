package com.bridgelabz;
/**
 * 
 */

/**
 * @author mshub *
 */

public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int year=2000;
		System.out.println("Year is "+" "+year);
		int a=year%4;
		int b=year%400;
		int c=year%100;
		
		if (a==0 && b==0 && c==0) {
			System.out.println("Input year is a leap Year"+" "+year);
		}else {
			System.out.println("Input year is not a leap year"+" "+year);
		}
		
	}

}
