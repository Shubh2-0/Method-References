package com.masai;

import java.util.function.Predicate;

public class PredicateExample {

	public static boolean checkPrimeNumber(int num) {
	
	if(num==1) return false;	
		
	for(int i=2;i<num;i++) {
		if(num%i==0)
			return false;
	}
	
	
	return true;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("\n\nCHECK NUMBER IS EVEN OR NOT USING PREDICATE");	
	Predicate<Integer> checkEven = i -> i%2==0;
	System.out.println("Number 5 is Even ? "+checkEven.test(5));
	System.out.println("Number 6 is Even ? "+checkEven.test(6));
	
	
	System.out.println("\n\nCHECK LENGTH OF THE STRING IS EVEN OR NOT USING PREDICATE");
	Predicate<String> checkLength = str -> str.length()%2==0;
	System.out.println("**Shubham** word have Even Length ? -> "+checkLength.test("Shubham"));
	System.out.println("**Java** word have Even Length ? -> "+checkLength.test("Java"));
	System.out.println("**Computer** word have Even Length ? -> "+checkLength.test("Computer"));
	System.out.println("**World** word have Even Length ? -> "+checkLength.test("World"));
	
	
	System.out.println("\n\nCHECK NUMBER IS PRIME OR NOT USING METHOD REFERENCE FOR IMPLEMENTATION OF TEST");
	Predicate<Integer> checkPrime = PredicateExample::checkPrimeNumber;
    int num = 8;
    int num2 = 3;
	System.out.println(num+" is Prime Number "+checkPrime.test(num));
	System.out.println(num2+" is Prime Number "+checkPrime.test(num2));
	
	
	System.out.println("\n\nCHECK AGE FOR LICENCE");
	Predicate<Integer> checkForLicence = e -> e>=18;
	System.out.println(39+" "+checkForLicence.test(39));
	System.out.println(17+" "+checkForLicence.test(17));
	
	
	
	
	
	
	
		
		
		
	}

	
	
	
}
