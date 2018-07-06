package com.amar.strings;

/**
 * The following program compares the time taken to reverse long string via String object and StringBuffer object.
 * 
 * @author amar.balgude
 */
public class StringBenchMark {

	public static void main(String[] args) {
		long beginTime, elapsedTime;
		
		// Build a long String
		String str = "";
		int size = 16536;
		beginTime = System.nanoTime(); // Reference time in nanoseconds.
		char ch = 'a';
		
		for(int count = 0; count < size; count++) {
			str += ch;
			ch++;
			if(ch > 'z'){
				ch = 'a';
			}
		}
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed Time is " + elapsedTime/1000 + " micro seconds (Build String)");
		
		// Reverse a String by building another String character-by-character in the reverse order
		String reverseStr = "";
		beginTime = System.nanoTime();
		for (int pos = str.length() - 1; pos >= 0; pos--) {
			reverseStr += str.charAt(pos);
		}
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed Time is " + elapsedTime / 1000 + " micro seconds (using String to Reverse)");
		
		
		// Reverse a String via an empty StringBuffer by appending characters in the reverse order
		StringBuffer sbuff = new StringBuffer(size);
		beginTime = System.nanoTime();
		for(int pos = str.length() - 1; pos >= 0; pos--) {
			sbuff.append(str.charAt(pos));
		}
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed time is " + elapsedTime / 1000 + " micro seconds (using StringBuffer to reverse)");
		
		// Reverse a String by creating a StringBuffer with the given String and invoke its reverse()
		StringBuffer sbuffReverse = new StringBuffer(str);
		beginTime = System.nanoTime();
		sbuffReverse.reverse();
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed time is " + elapsedTime / 1000 + " micro seconds (using StringBuffer's reverse() method.)");

		// Reverse a String via an empty StringBuffer by appending characters in the reverse order
		StringBuilder sbuild = new StringBuilder(size);
		beginTime = System.nanoTime();
		for(int pos = str.length() - 1; pos >= 0; pos--) {
			sbuild.append(str.charAt(pos));
		}
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed time is " + elapsedTime / 1000 + " micro seconds (using StringBuilder to reverse)");

		// Reverse a String by creating a StringBuffer with the given String and invoke its reverse()
		StringBuilder sbuildReverse = new StringBuilder(str);
		beginTime = System.nanoTime();
		sbuildReverse.reverse();
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed time is " + elapsedTime / 1000 + " micro seconds (using StringBuilder's reverse() method.)");
	}
}
