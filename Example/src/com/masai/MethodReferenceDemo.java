package com.masai;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

@FunctionalInterface
interface Interface1{

  void checkEven(int num);	
		
}


interface Interface2{
	
	void CheckOdd(int num);
}


interface Interface3{
	
	void checkPrime(int num);
}

interface Interface4{
	
	Integer stringToNumber(String num);
	
}


public class MethodReferenceDemo {
	
	public void checkPrimeNumber(int num) {
		
	if(num==1) {
		System.out.println("Number 1 is Not Prime");
		return;
	}
	
	for(int i=2;i<num;i++) {
		
		if(num%i==0)
			System.out.println("Number "+num+" is Not Prime");
		return;
		
		
	}
	
	System.out.println("Number "+num+" is Prime");
	
		
		
	}
	
	
	public static void checkEvenNumber(Integer num) {
	
		if(num%2==0) 
			System.out.println("Number "+ num +" is EVEN");
		else 
			System.out.println("Number "+ num +" is Not EVEN");
		
	}
	
	public void checkOddNumber(int num) {
		
		if(num%2!=0)
			System.out.println("Number "+ num + " is ODD");
		else
			System.out.println("Number "+ num +" is Not ODD");
		
	}
	
    
	
	public static void main(String[] args) {
	
		System.out.println("\n\nUSE METHOD REFERENCE FOR CHECKING THE ODD/EVEN NUMBER");
	     
	Interface1 i1 = MethodReferenceDemo::checkEvenNumber;
	i1.checkEven(6);
	i1.checkEven(21);
	
	MethodReferenceDemo obj = new MethodReferenceDemo();
	
     Interface2 i2 = obj::checkOddNumber;
     i2.CheckOdd(40);
     i2.CheckOdd(39);
	
	
     System.out.println("\n\nUSE METHOD REFERENCE FOR CHECKING THE PRIME NUMBER");
     
     Set<Integer> set = new LinkedHashSet<>();
     set.add(3);
     set.add(1);
     set.add(8);
     set.add(30);
     set.add(7);
     set.add(4);
     set.add(5);
     set.add(28);
     set.add(2);
     set.add(31);
     set.add(89);
     set.add(20);
     set.add(90);
     
     Interface3 i3 = obj::checkPrimeNumber;
     
     set.forEach(e -> i3.checkPrime(e) );
     
     System.out.println("\n\nUSING METHOD REFRENCE TO CONVERT STRING TO NUMBER");
     Interface4 i4 = Integer::parseInt;
     System.out.println(i4.stringToNumber("5920"));
     System.out.println(i4.stringToNumber("4"));
     System.out.println(i4.stringToNumber("10"));
     System.out.println(i4.stringToNumber("59"));
     
     
     
     
     
     
     
		
		
		
		
		
     
		
		
     
		
	}
	
	

}
