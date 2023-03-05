package com.masai;

import java.util.function.Function;

public class FunctionalFunctionExample {
	
	public static void main(String[] args) {
	
	System.out.println("CONVERT STRING TO NUMBER USING FUNCTION FUNCTIONAL INTERFACE");	
	Function<String, Integer> numtoString = Integer::parseInt;	
	System.out.println(numtoString.apply("500"));
	System.out.println(numtoString.apply("3"));
	
	
	System.out.println("\n\nCHECK AGE FOR ADMISSION IN MASAI USING FUNCTION FUNCTIONAL INTERFACE");
	Function<Integer, String> checkAge = e -> {
	
 	if(e<18) return e+" --> AGE IS LESS FOR ADMISSION";	
	
 	else if(e >= 18 && e < 28) return e+" --> AGE IS PERFECT FOR ADMISSION";
 	
 	else  return e+"  --> AGE IS MORE THAN 27 SORRY!!";
 	
 	
	};
	
	
	System.out.println(checkAge.apply(2));
	System.out.println(checkAge.apply(23));
	System.out.println(checkAge.apply(30));
	
	
		
		
	}

}
