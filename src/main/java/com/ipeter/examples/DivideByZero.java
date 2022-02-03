package com.ipeter.examples;

public class DivideByZero {

	public static void main(String[] args) {

		// *** cast 1 to double and then make 1.00/0.00 -> autoboxing to Double
		Double objectDouble = 1 / 0.0;
		System.out.println("1/0.0:" + objectDouble);

		// *** Cast 1 to double and then make 1.00/0.00
		double primitiveDouble = 1 / 0.0;
		System.out.println("1/0.0:" + primitiveDouble);

		// *** 1 / 0 for integer throw exception
		try {
			primitiveDouble = 1 / 0;
			System.out.println("1/0:" + primitiveDouble);
		} catch (java.lang.ArithmeticException e) {
			System.out.println("1 / 0 -> java.lang.ArithmeticException thrown");
		}
	}

}
