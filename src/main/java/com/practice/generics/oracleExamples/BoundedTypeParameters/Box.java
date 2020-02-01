// CHeck this when we want to use the comparision along with the generics
package com.practice.generics.oracleExamples.BoundedTypeParameters;

public class Box<T> {

	private T value;

	private <U extends Number>void  inspect(U u){
		System.out.println(u.intValue());
	}

	public static <T extends Comparable<T>> int findGreater(T[] arr, T value){
		int count = 0;
		for(T eachValue : arr){
			if(eachValue.compareTo(value) > 0){
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args){
		Box<Integer> integerBox = new Box<>();
		integerBox.inspect(10);

	}

}
