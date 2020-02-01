
package com.practice.generics.oracleExamples.GenericMethods;

public class TestingMain {

	public static void main(String[] args){
		GenericMethodExample<String, Integer> obj1= new GenericMethodExample<>("Arun", 1);
		GenericMethodExample<String, Integer> obj2 = new GenericMethodExample<>("Arun1", 1);

		System.out.println(Utils.compare(obj1, obj2));
	}
}

