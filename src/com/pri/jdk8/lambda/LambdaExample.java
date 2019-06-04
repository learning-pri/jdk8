package com.pri.jdk8.lambda;

public class LambdaExample {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {

		Greeting greetingLambda = () -> System.out.println("Greeting...");
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello World!");
			}

		};

		LambdaExample greet = new LambdaExample();
		greet.greet(greetingLambda);
		greet.greet(innerClassGreeting);
	}

}