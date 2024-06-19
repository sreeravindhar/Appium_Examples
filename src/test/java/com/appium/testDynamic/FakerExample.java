package com.greens.testDynamic;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakerExample {
	
	
	@Test
	public void testName() throws Exception {
		
		Faker f = new Faker();
		String fullName = f.name().fullName();
		System.out.println(fullName);
		String firstName = f.name().firstName();
		System.out.println(firstName);
		
		String fullAddress = f.address().fullAddress();
		System.out.println(fullAddress);
		
		String cellPhone = f.phoneNumber().cellPhone();
		System.out.println(cellPhone);
		
		int numberBetween = f.number().numberBetween(1, 9);
		System.out.println(numberBetween);
		
	}

}
