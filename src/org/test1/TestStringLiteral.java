package org.test1;

public class TestStringLiteral {
	
	public static void main(String[] args) {
		// literal * immutable
		String s1 = "Java";
		System.out.println(System.identityHashCode(s1));
		
		String s2 = "Java";
		System.out.println(System.identityHashCode(s2));
		
		s1= s1.concat(s2);
		System.out.println(s1);
		
		System.out.println(System.identityHashCode(s1));
		System.out.println("--------");
	
		// Non - Literal * mutable
	    StringBuilder s3 = new StringBuilder("welcome");
	    System.out.println(System.identityHashCode(s3));
	    
	    StringBuilder s4 = new StringBuilder("welcome");
	    System.out.println(System.identityHashCode(s4));
	    
	    
	    s3= s3.append(s4);
	    System.out.println(s3);
	    System.out.println(System.identityHashCode(s3));
	    
	    String s5 = "   ";
	    System.out.println(System.identityHashCode(s5));
	    
	    String s6 = null;
	    System.out.println(System.identityHashCode(s6));
	    
	    
	
	}

}
