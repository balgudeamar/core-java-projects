package com.amar.strings;

import java.util.StringTokenizer;

// Reverse the words in a String using StringTokenizer
public class StringTokenizerTester {

	public static void main(String[] args) {
		String str = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
		
		String reverseStr = "";
		StringBuilder sb = new StringBuilder();
		StringTokenizer strTokenizer = new StringTokenizer(str); // by default it will take space as delimiter.
		while(strTokenizer.hasMoreTokens()) {
			sb.insert(0, strTokenizer.nextToken());
			if(strTokenizer.hasMoreTokens()) {
				sb.insert(0, " ");
			}
		}
		reverseStr = sb.toString();
		System.out.println(reverseStr);
	}

}
