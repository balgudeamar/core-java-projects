package com.amar.bitshifting;

public class BitShiftTester {

	public static void main(String[] args) {
		int i = 9;
		i = i<<3; // left shift operator multiplies current value with 2 to the power of 
				  // shift number 
				  // e.g. 1. i = i<<3, here value of i is 9 and 2 raise to 3 = 8 so now i = 9*8 = 72  
				  // 	  2. i = i<<2, here value of i is 9 and 2 raise to 2 = 4 so now i = 9*4 = 36
		  		  // 	  3. i = i<<1, here value of i is 9 and 2 raise to 1 = 2 so now i = 9*2 = 16
		i = 9;
		i = i>>1; // left shift operator divides current value with 2 to the power of 
				  // shift number 
				  // e.g. 1. i = i>>3, here value of i is 9 and 2 raise to 3 = 8 so now i = 9/8 = 1  
				  // 	  2. i = i>>2, here value of i is 9 and 2 raise to 2 = 4 so now i = 9/4 = 2
				  // 	  3. i = i>>1, here value of i is 9 and 2 raise to 1 = 2 so now i = 9/2 = 4
		System.out.println(i);
	}

}
