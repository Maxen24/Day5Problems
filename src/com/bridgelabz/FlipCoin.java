/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
import java.lang.Math;
public class FlipCoin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	double filipcoin= Math.random();
	double totalvalue=10.00;
	for (; filipcoin<=totalvalue; filipcoin++) {
	if (filipcoin>0.5) {
		System.out.println("Tail" +" "+filipcoin);
		double Tailpercentage=(filipcoin/totalvalue)*100;
		System.out.println("Tail percentage is "+" "+Tailpercentage);
	}else {
		System.out.println("Head"+" "+filipcoin);
		double Headpercentage=(filipcoin/totalvalue)*100;
		System.out.println("Head percentage is "+" "+Headpercentage);
		
	}
	}
	}
}
