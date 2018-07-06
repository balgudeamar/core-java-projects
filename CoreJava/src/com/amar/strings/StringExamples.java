package com.amar.strings;

public class StringExamples {

	public static void main(String[] args) {
		// ways of creating strings objects.
		String str1 = "This is string";
		String str2 = new String(); // Use of default constructor is unnecessary since String objects are immutable.
		String str3 = new String("This is string"); // use of this constructor is unnecessary unless you need a copy of input string
		StringBuilder strBuilder = new StringBuilder("This is string");
		String str4 = new String(strBuilder); // creates new string object using StringBuilder contents. 
		StringBuffer strBuffer = new StringBuffer("This is string");
		String str5 = new String(strBuffer); // creates new string object using StringBuffer contents. 
		char[] charArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		String str6 = new String(charArray); // creates new string object using character array.
		
		String abc = "abc" + "pqr"; // compiler will convert it to => new StringBuilder("abc").append("pqr")
		
		
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = s2.intern();
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s2));
		
		final String s4 = "This is string";
		String s5 = "new String";
		String s6 =  s5 + s4;
		System.out.println("This is stringnew String" == s6); // This condition will be true only if s4 and s5 both should be made as constant.
		
		StringBuilder sb = new StringBuilder("This is string");
		sb.insert(0, "ABC");
		System.out.println("SB value is :" + sb);
		sb.append(new char[]{'P', 'Q', 'R', 'S'}, 2, 1);
		System.out.println("SB new value is :" + sb);
	}	
	
}
