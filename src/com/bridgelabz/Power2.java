/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
import java.lang.Math;
public class Power2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double x,y;  //Two variable
		x = Double.parseDouble(args[0]); // Variable Passed from string to Integer value.
		y = Double.parseDouble(args[1]);
		
		System.out.println("Power of two number is "+" "+(Math.pow(x, y)));

	}

}
