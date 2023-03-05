package com.masai;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {
	
	public static void main(String[] args) {
	
	System.out.println("RETURN A RANDOM NUMBER USING SUPPLIER");	
	Supplier<Integer> random = () -> (int) Math.floor(Math.random()*50);	
	System.out.println(random.get());
	
	
	System.out.println("\n\nRETURN A GREETING MESSAGE USING SUPPLIER");
	Supplier<String> greet = () -> "Hello";
	System.out.println(greet.get());
	
	
	System.out.println("\n\nRETURN CURRENT DATE USING SUPPLIER");
	Supplier<String> today = () -> LocalDate.now().toString();
	System.out.println(today.get());
	
	
	System.out.println("\n\nRETURN MONETH NAME USING SUPPLIER");
	Supplier<String> month = () -> LocalDate.now().getMonth().toString();
	System.out.println(month.get());
	
	
	System.out.println("\n\nRETURN DAY NAME USING SUPPLIER");
	Supplier<String> day = () -> LocalDate.now().getDayOfWeek().toString();
	System.out.println(day.get());
	
		
		
		
		
	}

}
