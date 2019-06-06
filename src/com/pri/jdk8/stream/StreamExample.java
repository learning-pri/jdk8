package com.pri.jdk8.stream;

import java.util.Arrays;
import java.util.List;

import com.pri.jdk8.lambda.Person;

public class StreamExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Priyank", "Shukla", 35),
				new Person("Ruchi", "Shukla", 35),
				new Person("Nishant", "Bajpai", 28),
				new Person("Aditya", "Tyagi", 37)
				);
		people.stream()
		.filter(p->p.getLastName().startsWith("S"))
		.forEach(System.out::println);;
		
	}

}
