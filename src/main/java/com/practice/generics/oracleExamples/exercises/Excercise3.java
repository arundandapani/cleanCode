package com.practice.generics.oracleExamples.exercises;

public class Excercise3<T> {

	public <T> void exchange(T[] arr, int first, int second){
		T element = arr[first];
		arr[first] = arr[second];
		arr[second] = element;
	}

}
