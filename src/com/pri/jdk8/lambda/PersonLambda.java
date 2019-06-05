package com.pri.jdk8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PersonLambda {

	public static void main(String[] args) {

		PersonLambda personLambda = new PersonLambda();
		List<Person> people = Arrays.asList(
				new Person("Priyank", "Shukla", 35),
				new Person("Ruchi", "Shukla", 35),
				new Person("Nishant", "Bajpai", 28),
				new Person("Aditya", "Tyagi", 37)
				);
		
		
		personLambda.performConditional(people, p -> true);
		
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
System.out.println("###################  PRINTING LIST POST SHORTING  #################");
		personLambda.performConditional(people, p ->true);
		
		
		System.out.println("##################################################");
		personLambda.performConditional(people, p ->p.getLastName().startsWith("S"));
	}
	
	public void performConditional(List<Person> p, Predicate<Person> c) {
		for (Person person : p) {
			if(c.test(person))
			System.out.println(person);
		}
	}

}
