// Constructor can have generics in them
package com.practice.generics.oracleExamples.typeInterface;

public class MyClass<X> {

	<T> MyClass(T value) {

	}

	public static void main(String[] args) {
		MyClass<Integer> myClass = new MyClass<Integer>("");
	}
}
