package com.masai;

import java.util.Iterator;
import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		
	System.out.println("PRINTING SQUARE OF THE NUKMBER BY USING CONSUMER INTERFACE");	
	Consumer<Integer> square = e -> System.out.println(e*e);
	
	System.out.print("Square of 6930 is ");
			square.accept(6480);
	System.out.print("Square of 7 is ");
	       square.accept(7);
			
	
	       
	       System.out.println("\n\nPRINTING LENGTH OF THE STRING BY USING CONSUMER INTERFACE");
	       
	       Consumer<String> printLength = e -> System.out.println("Length of "+e+" is "+e.length());
	       
	       printLength.accept("Masai School");
	       printLength.accept("Java Development");
	       
	       
	       
	       

	       
	       System.out.println("\n\nPRINTING THE COUNT OF VOWELS AND CONSONENTS OF THE STRING BY USING CONSUMER INTERFACE");
	       Consumer<String> checkVoCo = e1 -> {
	       char[] e  = e1.toCharArray(); 	   
	       int co = 0;
	       int vo = 0;
	        for(Character el : e) {
	        if(el=='a' || el=='i' || el=='o' || el=='u' || el=='e')
	        	vo++;
	        else 
	        	if(el.isAlphabetic(el))
	        	co++;
	        }
	        
	    	System.out.println("**"+e1+"** have "+vo +" number of Vowels and "+co+" number of  consonant");
	       };
	       
	       checkVoCo.accept("Masai School");
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	          
	       
	       
	       
	
		
		
		
		
	}
	

}
