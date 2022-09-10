/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
public class EvenOdd {


		public static void main(String[] args) {
			int[] numbers = {1,2,3,4,5,6,7,8,9,10};
			for(int i=0; i<=numbers.length-1; i++) {
				if (numbers[i]%2==0) {
					System.out.println("Even Numbers"+" "+numbers[i]);
				}else {
					System.out.println("Odd Numbers"+ " "+numbers[i]);
				}
				
			}
			
					
			
		

	}

}
