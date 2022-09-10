/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
public class SwitchAlphabet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char ch= 'c';
		switch (ch) {
		case 'a':
		case 'i':
		case 'o':
		case 'u':
		case 'e':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch+ " "+ "is Vowel");
			break;
			default:
			System.out.println(ch+" "+ "is consonant");
			
		}

	}

}
